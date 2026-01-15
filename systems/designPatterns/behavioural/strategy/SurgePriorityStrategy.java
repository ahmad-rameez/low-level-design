package designPatterns.behavioural.strategy;

public class SurgePriorityStrategy implements MatchingStrategy{
    @Override
    public void match(String riderLocation) {
        System.out.println("This is surge " + riderLocation);
    }
}
