package lld.gpt.rateLimiter;

public class RateLimiterService implements RateLimiter {

    private final RateLimiterStrategy rateLimiterStrategy;

    public RateLimiterService(RateLimiterStrategy rateLimiterStrategy) {
        this.rateLimiterStrategy = rateLimiterStrategy;
    }

    @Override
    public boolean allowRequest(String userId) {
        // validate
        if(userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid User Id");
        }

        return rateLimiterStrategy.allowRequest(userId);
    }
}
