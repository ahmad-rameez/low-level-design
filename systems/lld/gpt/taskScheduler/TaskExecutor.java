package lld.gpt.taskScheduler;

import java.util.concurrent.*;

import static lld.gpt.taskScheduler.TaskStatus.*;

public class TaskExecutor {
    private DelayQueue<ScheduledTask> taskDelayQueue;
    private ConcurrentHashMap<String, ScheduledTask> taskIndex;

    private final Thread schedulerThread;        // consumes DelayQueue
    private final ExecutorService taskExecutor;  // runs Runnable actions


    public TaskExecutor() {
        this.taskExecutor = Executors.newFixedThreadPool(5);
        this.taskDelayQueue = new DelayQueue<>();
        this.taskIndex = new ConcurrentHashMap<>();

        schedulerThread = new Thread(() -> {
            while (true) {
                try {
                    ScheduledTask scheduledTask = taskDelayQueue.take();
                    Task task = scheduledTask.getTask();

                    if (task.getStatus() == CANCELLED) {
                        taskIndex.remove(task.getId());
                        continue;
                    }

                    task.setStatus(RUNNING);

                    taskExecutor.submit(() -> {
                        try {
                            task.getAction().run();
                        } finally {
                            task.setStatus(FINISHED);
                            taskIndex.remove(task.getId());
                        }
                    });

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        schedulerThread.start();
    }

    public void submit(ScheduledTask scheduledTask){
        Task task = scheduledTask.getTask();
        taskIndex.put(task.getId(), scheduledTask);
        taskDelayQueue.put(scheduledTask);
    }

    public boolean cancel(String taskId){
        ScheduledTask scheduledTask = taskIndex.remove(taskId);
        if (scheduledTask == null) return false;

        Task task = scheduledTask.getTask();
        if (task.getStatus() != SCHEDULED) return false;

        boolean removed = taskDelayQueue.remove(scheduledTask);
        if (removed) {
            task.setStatus(CANCELLED);
        }
        return removed;


    }


}
