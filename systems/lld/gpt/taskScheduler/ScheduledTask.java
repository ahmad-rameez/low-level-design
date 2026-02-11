package lld.gpt.taskScheduler;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class ScheduledTask implements Delayed {
    private final Task task;

    public ScheduledTask(Task task) {
        this.task = task;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long delay = task.getRunAt() - System.currentTimeMillis();
        return unit.convert(Math.max(delay, 0), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(this.task.getRunAt(), ((ScheduledTask) other).task.getRunAt());
    }

    public Task getTask(){
        return task;
    }
}
