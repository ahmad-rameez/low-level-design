package lld.gpt.notificationSystem;

public class Notification {
    private final String id;
    private final String userId;
    private final String content;
    private final long timestamp;

    public Notification(String id, String userId, String content, long timestamp) {
        this.id = id;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
