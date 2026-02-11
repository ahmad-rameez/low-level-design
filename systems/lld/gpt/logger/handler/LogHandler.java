package lld.gpt.logger.handler;

import lld.gpt.logger.LogLevel;

public interface LogHandler {
    void log(LogLevel level, String message);

    void setNext(LogHandler next);
}
