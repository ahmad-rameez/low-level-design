package lld.gpt.notificationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotificationService {
    private final List<Notification> notificationHistory;
    private final List<NotificationChannel> channels = new ArrayList<>();

    public NotificationService(List<NotificationChannel> channels) {
        this.notificationHistory = new ArrayList<>();
        this.channels.addAll(channels);
    }

    public void sendNotification(String userId, String content){
        Notification notification = new Notification(UUID.randomUUID().toString(), userId, content, System.currentTimeMillis());
        for(NotificationChannel channel : channels){
            channel.send(notification);
        }
        notificationHistory.add(notification);
    }

}
