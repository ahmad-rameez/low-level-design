package lld.gpt.rateLimiter;

public class LimitExceedException extends RuntimeException {
    public LimitExceedException(String s) {
        super(s);
    }
}
