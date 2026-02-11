package lld.gpt.logger.handler;

import lld.gpt.logger.LogFormatter;
import lld.gpt.logger.LogLevel;

public class InfoLogHandler implements LogHandler {

    private LogHandler nextHandler;
    private final LogFormatter logFormatter;

    public InfoLogHandler(LogFormatter logFormatter) {
        this.logFormatter = logFormatter;
    }

    @Override
    public void log(LogLevel level, String message) {
        if (level.getSeverity() == LogLevel.INFO.getSeverity()) {
            System.out.println(logFormatter.format(level, message));
        }

        // Always forward
        if (nextHandler != null) {
            nextHandler.log(level, message);
        }
    }

    @Override
    public void setNext(LogHandler next) {
        this.nextHandler = next;
    }
}

