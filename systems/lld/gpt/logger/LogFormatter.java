package lld.gpt.logger;

public interface LogFormatter {
    String format(LogLevel level, String message);
}
