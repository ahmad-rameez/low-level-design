package designPatterns.creational.factory;

public class AirLogistics implements ILogistics{
    @Override
    public void send() {
        System.out.println("Sending via Air");
    }
}
