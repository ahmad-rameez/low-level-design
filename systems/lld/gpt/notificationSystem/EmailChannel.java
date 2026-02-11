package lld.gpt.notificationSystem;

public class EmailChannel implements NotificationChannel{
    @Override
    public void send(Notification notification) {
        System.out.println("Email sending to " + notification.getUserId());
    }
}
