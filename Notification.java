package com.linkdin_platform;

import java.util.Date;
import java.util.UUID;

public class Notification {
    public enum NotificationType {
        MESSAGE,
        CONNECTION,
        JOB,
        POST
    }

    private UUID notificationId;
    private User user;
    private String message;
    private NotificationType type;
    private boolean isRead;
    private Date createdAt;

    public Notification(UUID notificationId, User user, String message, NotificationType type, boolean isRead, Date createdAt) {
        this.notificationId = notificationId;
        this.user = user;
        this.message = message;
        this.type = type;
        this.isRead = isRead;
        this.createdAt = createdAt;
    }

    // Getters and setters
    public UUID getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public NotificationType getType() {
        return type;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }
}
