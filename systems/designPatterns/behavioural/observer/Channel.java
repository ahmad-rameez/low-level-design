package designPatterns.behavioural.observer;

public interface Channel {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubscribers(String videoTitle);
}
