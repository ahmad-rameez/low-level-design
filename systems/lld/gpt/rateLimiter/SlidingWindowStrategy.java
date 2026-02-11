package lld.gpt.rateLimiter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentHashMap;

public class SlidingWindowStrategy implements RateLimiterStrategy {

    private final ConcurrentHashMap<String, Deque<Long>> requestUserMap;
    private final int maxRequests;
    private final long windowSize;

    public SlidingWindowStrategy(long windowSize, int maxRequests) {
        this.requestUserMap = new ConcurrentHashMap<>();
        this.maxRequests = maxRequests;
        this.windowSize = windowSize;
    }

    @Override
    public boolean allowRequest(String userId) {
        long now = System.currentTimeMillis();
        Deque<Long> deque =
            requestUserMap.computeIfAbsent(userId, k -> new ArrayDeque<>());

        synchronized (deque) {
            while (!deque.isEmpty() && deque.peekFirst() <= now - windowSize) {
                deque.pollFirst();
            }

            if (deque.size() >= maxRequests) {
                return false;
            }
            deque.addLast(now);
            return true;
        }
    }
}
