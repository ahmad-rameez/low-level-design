package designPatterns.behavioural.template;

public abstract class NotificationSender {

    // Template Method
    public final void send(String to, String rawMessage) {
        rateLimitCheck(to);
        validateRecipient(to);
        String formatted = formatMessages(rawMessage);
        preSendAuditLog(to, formatted);

        String composedMessage = composeMessage(formatted);
        sendMessage(to, composedMessage);

        postSendAnalytics(to);
    }

    private void rateLimitCheck(String to){
        System.out.println("Rate checked for " + to);
    }

    private void validateRecipient(String to){
        System.out.println("Validated " + to);
    }

    private String formatMessages(String message){
        return message.trim();
    }

    private void preSendAuditLog(String to, String message){
        System.out.println("Audit " + to + message);
    }

    private void postSendAnalytics(String to){
        System.out.println("Analytics " + to);
    }

    protected abstract String composeMessage(String message);

    protected abstract void sendMessage(String to, String message);
}
