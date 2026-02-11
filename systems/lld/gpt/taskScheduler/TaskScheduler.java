package lld.gpt.taskScheduler;

public interface TaskScheduler {
    String schedule(Runnable action, long runAt);
    boolean cancel(String taskId);
}
