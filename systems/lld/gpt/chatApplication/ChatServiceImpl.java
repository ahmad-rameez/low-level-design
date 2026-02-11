package lld.gpt.chatApplication;

import lld.gpt.chatApplication.domain.Conversation;
import lld.gpt.chatApplication.domain.Message;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChatServiceImpl implements ChatService{
    private Map<Integer, ChatSession> activeSessions;
    private Map<String, Conversation> conversations;

    public ChatServiceImpl() {
        this.activeSessions = new ConcurrentHashMap<>();
        this.conversations = new ConcurrentHashMap<>();
    }

    @Override
    public void connectUser(int userId, ChatSession session) {
        activeSessions.put(userId, session);

        for (Conversation conversation : conversations.values()) {
            for (Message message : conversation.getMessages()) {
                if (message.getReceiverId() == userId) {
                    session.deliver(message);
                }
            }
        }
    }


    @Override
    public void disconnectUser(int userId) {
        activeSessions.remove(userId);
    }

    @Override
    public void sendMessage(int fromUserId, int toUserId, String content) {
        Message message = new Message(
            fromUserId,
            toUserId,
            content,
            System.currentTimeMillis()
        );

        String conversationId =
            Math.min(fromUserId, toUserId) + "_" + Math.max(fromUserId, toUserId);

        Conversation conversation =
            conversations.computeIfAbsent(
                conversationId,
                id -> new Conversation(fromUserId, toUserId)
            );

        conversation.addMessage(message);
        ChatSession session = activeSessions.get(toUserId);

        if (session != null) {
            session.deliver(message);
        }
    }

    @Override
    public List<Message> getChatHistory(int userA, int userB) {
        String conversationId =
            Math.min(userA, userB) + "_" + Math.max(userA, userB);

        Conversation conversation = conversations.get(conversationId);
        if (conversation == null) {
            return List.of();
        }

        return conversation.getMessages();
    }

}
