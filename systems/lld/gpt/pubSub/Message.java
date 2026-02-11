package lld.gpt.pubSub;

public class Message {
    private final String id;
    private final String content;
    private final long timestamp;

    public Message(String id, String content, long timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
