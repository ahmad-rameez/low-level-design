package lld.gpt.logger;

public class DefaultLogFormatter implements LogFormatter {
    @Override
    public String format(LogLevel level, String message) {
        return String.format(
            "[%d] [%s] [%s] %s",
            System.currentTimeMillis(),
            level.name(),
            Thread.currentThread().getName(),
            message
        );
    }
}

