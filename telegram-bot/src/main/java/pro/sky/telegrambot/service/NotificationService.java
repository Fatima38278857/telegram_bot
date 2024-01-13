package pro.sky.telegrambot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.repository.NotificationTaskRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class NotificationService {


    private final NotificationTaskRepository notificationTaskRepository;
    private final TelegramBot telegramBot;

    public NotificationService(NotificationTaskRepository notificationTaskRepository, TelegramBot telegramBot) {
        this.notificationTaskRepository = notificationTaskRepository;
        this.telegramBot = telegramBot;
    }


    public void notification() {
//        findAllByExecDate(LocalDateTime
//                .now().truncatedTo(ChronoUnit.MINUTES)).
        notificationTaskRepository.findAll().forEach(notificationTask -> {
            SendMessage message = new SendMessage(notificationTask.getChatId(), notificationTask.getContentNotification());
            telegramBot.execute(message);
        });
    }
}
