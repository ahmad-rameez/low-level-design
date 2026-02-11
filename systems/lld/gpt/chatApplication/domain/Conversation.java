package lld.gpt.chatApplication.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversation {
    private final String id;
    private final int userA;
    private final int userB;
    private List<Message> messages;

    public Conversation(int userA, int userB) {
        this.userA = userA;
        this.userB = userB;
        this.id = Math.min(userA, userB) + "_" + Math.max(userA, userB);
        messages = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public int getUserA() {
        return userA;
    }

    public int getUserB() {
        return userB;
    }

    public List<Message> getMessages() {
        return Collections.unmodifiableList(messages);
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }
}
