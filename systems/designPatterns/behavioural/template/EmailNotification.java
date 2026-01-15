package designPatterns.behavioural.template;

public class EmailNotification extends NotificationSender {
    @Override
    protected String composeMessage(String message) {
        return "";
    }

    @Override
    protected void sendMessage(String to, String message) {

    }
}
