package com.linkdin_platform;

import java.util.Date;
import java.util.UUID;

public class Message {
    private UUID messageId;
    private User from;
    private User to;
    private String content;
    private Date sentAt;
    private boolean isDeleted;

    public Message(User from, User to, String content) {
        this.messageId = UUID.randomUUID();
        this.from = from;
        this.to = to;
        this.content = content;
        this.sentAt = new Date();
        this.isDeleted = false;
    }

    // Simulate sending a message
    public void send() {
        System.out.println("Message sent from " + from.getName() + " to " + to.getName() + ": " + content);
        // You could also push this message into a MessageService or recipient's inbox
    }

    // Soft delete the message
    public void delete() {
        this.isDeleted = true;
        System.out.println("Message " + messageId + " has been marked as deleted.");
    }

    // Getters
    public UUID getMessageId() {
        return messageId;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public String getContent() {
        return isDeleted ? "[Message Deleted]" : content;
    }

    public Date getSentAt() {
        return sentAt;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}
