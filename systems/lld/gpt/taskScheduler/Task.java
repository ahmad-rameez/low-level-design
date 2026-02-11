package lld.gpt.taskScheduler;

import java.util.UUID;

public class Task {
    private final String id;
    private final Runnable action;
    private final long runAt;
    private volatile TaskStatus status;

    public Task(Runnable action, long runAt) {
        this.id = UUID.randomUUID().toString();
        this.action = action;
        this.runAt = runAt;
        this.status = TaskStatus.SCHEDULED;
    }

    public String getId() {
        return id;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Runnable getAction() {
        return action;
    }

    public long getRunAt() {
        return runAt;
    }

    public TaskStatus getStatus(){
        return status;
    }
}
