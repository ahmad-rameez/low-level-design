package designPatterns.creational.factory;

public class RoadLogistics implements ILogistics{

    @Override
    public void send(){
        System.out.println("Sending by Road");
    }
}
