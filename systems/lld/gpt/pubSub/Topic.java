package lld.gpt.pubSub;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Topic {
    private final String name;
    private final Set<Subscriber> subscribers = new CopyOnWriteArraySet<>();
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    public Topic(String name) {
        this.name = name;
    }

    public void publish(Message message){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(Subscriber sub : subscribers){
                    try {
                        sub.onMessage(message);
                    } catch (Exception e){
                        // log
                        System.out.println("Publish failed for Subscriber " + sub);
                    }

                }
            }
        };
        executor.submit(runnable);
    }

    public String getName() {
        return name;
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public boolean removeSubscriber(Subscriber subscriber){
        return subscribers.remove(subscriber);
    }
}
