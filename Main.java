package com.linkdin_platform;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        System.out.println("------------------- WELCOME TO LINKDIN PLATFORM____________________________-");
        System.out.println();
        System.out.println();
        System.out.println();
        // === Create Users ===
        User alice = new User( "Alice Johnson", "alice@example.com", "hashed123");
        User bob = new User( "Bob Smith", "bob@example.com", "hashed456");
        alice.login();
        bob.login();
        // === Create Company ===
        Company google = new Company("Google", "Tech Giant");
        User recruiter = new User( "Recruiter Google", "recruiter@google.com", "hashed789");

        // === Create Profiles ===
        Profile aliceProfile = new Profile(alice.getUserId());
        alice.setProfile(aliceProfile);

       Profile bobProfile = new Profile(bob.getUserId());
        bob.setProfile(bobProfile);

        // === Add Skills ===
        Skill javaSkill = new Skill("Java");
        Skill reactSkill = new Skill("React");

       alice.getProfile().addSkill(javaSkill);
       bob.getProfile().addSkill(reactSkill);

        // === Endorse Skills ===
         bob.getProfile().endorseSkill(reactSkill, alice);
        alice.getProfile().endorseSkill(javaSkill, bob);

        // === Recommendation ===
        Recommendation rec = new Recommendation(bob, "Alice is a dedicated backend engineer.");
        alice.getProfile().addRecommendation(rec);

        // === Connection Request ===
        alice.sendConnectionRequest(bob); // send request
        bob.acceptConnectionRequest(alice); // accept request

        // === Messaging ===
        Message msg = new Message(alice, bob, "Hi Bob, nice to connect!");
        msg.send();
        msg.delete(); // optional

        // === Job Posting ===
        List<String> requirements = Arrays.asList("Java", "Spring Boot", "3+ years experience");
        Job javaDevJob = new Job(google, "Java Developer", "Develop scalable backend services.", requirements, "Mountain View");

        google.postJob(javaDevJob);

        // === Job Application ===
        bob.applyToJob(javaDevJob, "https://example.com/resume-bob.pdf");

        // === Notification ===
        Notification notification = new Notification(UUID.randomUUID(), bob, "You have a new job interview!", Notification.NotificationType.JOB, false, new Date());
        System.out.println("Notification: " + notification.getMessage());

        // Done!
        System.out.println("\n✅ Simulation Complete.");
    }
}

