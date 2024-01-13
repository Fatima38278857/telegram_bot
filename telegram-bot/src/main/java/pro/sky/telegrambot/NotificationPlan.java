package pro.sky.telegrambot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pro.sky.telegrambot.service.NotificationService;


@Component
public class NotificationPlan {

    private final NotificationService notificationService;

    public NotificationPlan(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @Scheduled(fixedDelay = 60000)
    public void sendNotification() {
        notificationService.notification();
    }
}

