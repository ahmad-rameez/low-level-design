package designPatterns.behavioural.observer;

public class MobileAppSubscriber implements Subscriber{
    private String username;

    public MobileAppSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String title) {
        System.out.println("In app notification sent to " + username + " video is out : " + title);
    }
}
