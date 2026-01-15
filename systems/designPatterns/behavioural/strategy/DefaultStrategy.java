package designPatterns.behavioural.strategy;

public class DefaultStrategy implements MatchingStrategy{
    @Override
    public void match(String riderLocation) {
        System.out.println("Default matching Strategy: " + riderLocation);
    }
}
