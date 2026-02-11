package lld.gpt.chatApplication;

import lld.gpt.chatApplication.domain.Message;

import java.util.List;

public interface ChatService {
    void connectUser(int userId, ChatSession session);

    void disconnectUser(int userId);

    void sendMessage(int fromUserId, int toUserId, String content);

    List<Message> getChatHistory(int userA, int userB);
}
