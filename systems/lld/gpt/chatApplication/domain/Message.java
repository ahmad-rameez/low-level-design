package lld.gpt.chatApplication.domain;

import java.util.UUID;

public class Message {
    private final String id;
    private final String content;
    private final int senderId;
    private final int receiverId;
    private final long timestamp;

    public Message(int senderId, int receiverId, String content, long timestamp) {
        this.id = UUID.randomUUID().toString();
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
