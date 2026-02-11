package lld.gpt.taskScheduler;

public class TaskSchedulerImpl implements TaskScheduler{
    private final TaskExecutor taskExecutor;

    public TaskSchedulerImpl(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    @Override
    public String schedule(Runnable action, long runAt) {
        Task task = new Task(action, runAt);
        ScheduledTask scheduledTask = new ScheduledTask(task);
        taskExecutor.submit(scheduledTask);
        return task.getId();
    }

    @Override
    public boolean cancel(String taskId) {
        return taskExecutor.cancel(taskId);
    }
}
