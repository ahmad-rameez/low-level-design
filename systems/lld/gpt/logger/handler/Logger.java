package lld.gpt.logger.handler;

import lld.gpt.logger.LogLevel;

public interface Logger {
    void log(LogLevel level, String message);

}
