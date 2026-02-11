package lld.gpt.chatApplication;

import lld.gpt.chatApplication.domain.Message;

public interface ChatSession {
    void deliver(Message message);
}