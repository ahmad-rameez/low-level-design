package lld.gpt.rateLimiter;

public interface RateLimiterStrategy {
    boolean allowRequest(String userId);
}
