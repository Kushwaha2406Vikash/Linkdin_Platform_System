package com.linkdin_platform;

import java.util.ArrayList;
import java.util.UUID;

import java.util.List;

import java.util.*;

public class User {
    private UUID userId;
    private String name;
    private String email;
    private String passwordHash;
    private Date createdAt;

    private Profile profile;
    private List<Connection> connections;
    private List<Notification> notifications;

    public User(String name, String email, String passwordHash) {
        this.userId = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.createdAt = new Date();
        this.connections = new ArrayList<>();
        this.notifications = new ArrayList<>();
        this.profile = new Profile(this.getUserId());
    }

    public void login() {
        System.out.println(name + " login in successfully.");
    }

    public void logout() {
        System.out.println(name + " log out successfully.");
    }

    public void updateProfile(Profile updatedProfile) {
        this.profile = updatedProfile;
        System.out.println("Profile updated for user: " + name);
    }

    public void sendConnectionRequest(User user) {
        Connection connection = new Connection(this, user, Connection.ConnectionStatus.PENDING);
        this.connections.add(connection);
        user.receiveConnectionRequest(connection);
        System.out.println(this.name + " sent a connection request to " + user.name);
    }

    private void receiveConnectionRequest(Connection connection) {
        this.connections.add(connection);
        notifications.add(new Notification(
                UUID.randomUUID(), this,
                "You have a new connection request from " ,
                Notification.NotificationType.CONNECTION, false, new Date()
        ));
    }



    public void acceptConnectionRequest(User fromUser) {
        for (Connection connection : connections) {
            if (connection != null && connection.getFromUser() != null &&
                    connection.getFromUser().equals(fromUser) &&
                    connection.getStatus() == Connection.ConnectionStatus.PENDING) {

                connection.setStatus(Connection.ConnectionStatus.CONNECTED);

                System.out.println(this.name + " accepted connection request from " + fromUser.name);
                return;
            }
        }

        System.out.println("No pending request found from " + fromUser.name);
    }


    public void applyToJob(Job jobprofile,String resumeurl){
        jobprofile.apply(this,resumeurl);
    }
    // Getters
    public UUID getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Profile getProfile() { return profile; }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
