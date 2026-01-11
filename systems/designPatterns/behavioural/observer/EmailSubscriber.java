package designPatterns.behavioural.observer;

public class EmailSubscriber implements Subscriber{
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String title) {
        System.out.println("Email notification is sent to " + email + " Video is out: " + title);
    }
}
