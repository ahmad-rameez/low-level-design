package lld.gpt.logger.handler;

import lld.gpt.logger.LogFormatter;
import lld.gpt.logger.LogLevel;

public class LoggerImpl implements Logger{
    private final LogHandler rootHandler;

    public LoggerImpl(LogFormatter formatter) {
        this.rootHandler = getRootHandler(formatter);
    }

    private LogHandler getRootHandler(LogFormatter formatter) {
        final LogHandler rootHandler;
        LogHandler debug = new DebugLogHandler(formatter);
        LogHandler info = new InfoLogHandler(formatter);
        LogHandler warn = new WarnLogHandler(formatter);
        LogHandler error = new ErrorLogHandler(formatter);

        debug.setNext(info);
        info.setNext(warn);
        warn.setNext(error);
        error.setNext(null);

        rootHandler = debug;
        return rootHandler;
    }

    @Override
    public synchronized void log(LogLevel level, String message) {
        rootHandler.log(level, message);
    }
}
