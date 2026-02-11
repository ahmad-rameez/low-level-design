package lld.gpt.rateLimiter;

public interface RateLimiter {
    boolean allowRequest(String userId);
}
