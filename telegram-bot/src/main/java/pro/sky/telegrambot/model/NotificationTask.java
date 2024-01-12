package pro.sky.telegrambot.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class NotificationTask {
    @Id
    @GeneratedValue
    private Long id = 0L;
    @Column(name = "chat_id")
    private Long chatId;
    @Column(name = "content_notification")
    private String contentNotification;
    @Column(name = "date_time_notification")
    private LocalDateTime dateTimeNotification;


    public NotificationTask(Long chatId, String contentNotification, LocalDateTime dateTimeNotification) {
        this.chatId = chatId;
        this.contentNotification = contentNotification;
        this.dateTimeNotification = dateTimeNotification;
    }

    public NotificationTask() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getContentNotification() {
        return contentNotification;
    }

    public void setContentNotification(String contentNotification) {
        this.contentNotification = contentNotification;
    }

    public LocalDateTime getDateTimeNotification() {
        return dateTimeNotification;
    }

    public void setDateTimeNotification(LocalDateTime dateTimeNotification) {
        this.dateTimeNotification = dateTimeNotification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask that = (NotificationTask) o;
        return Objects.equals(id, that.id) && Objects.equals(chatId, that.chatId) && Objects.equals(contentNotification, that.contentNotification) && Objects.equals(dateTimeNotification, that.dateTimeNotification);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, contentNotification, dateTimeNotification);
    }

    @Override
    public String toString() {
        return "NotificationTask{" +
                "Идентификатор=" + id +
                ", Чат_ID =" + chatId +
                ", Садержание_Уведомления ='" + contentNotification + '\'' +
                ", Дата_Время_Уведомления=" + dateTimeNotification +
                '}';
    }
}


