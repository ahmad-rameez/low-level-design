package lld.gpt.pubSub;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PubSubService {
    private Map<String, Topic> topics;

    public PubSubService() {
        this.topics = new ConcurrentHashMap<>();
    }

    public void publish(String topicName, Message message){
        Topic topic = topics.computeIfAbsent(
            topicName,
            Topic::new
        );
        topic.publish(message);
    }

    public void subscribe(String topicName, Subscriber subscriber){
        Topic topic = topics.computeIfAbsent(
            topicName,
            Topic::new
        );
        topic.addSubscriber(subscriber);
    }

    public boolean unsubscribe(String topicName, Subscriber subscriber){
        Topic topic = topics.computeIfAbsent(
            topicName,
            Topic::new
        );
        return topic.removeSubscriber(subscriber);
    }
}
