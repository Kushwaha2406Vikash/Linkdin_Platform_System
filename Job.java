package com.linkdin_platform;

import java.util.*;

public class Job {
    private UUID jobId;
    private Company postedBy;
    private String title;
    private String description;
    private List<String> requirements;
    private String location;
    private Date postedAt;
    private List<JobApplication> applications;

    public Job(Company postedBy, String title, String description, List<String> requirements, String location) {
        this.jobId = UUID.randomUUID();
        this.postedBy = postedBy;
        this.title = title;
        this.description = description;
        this.requirements = new ArrayList<>(requirements);
        this.location = location;
        this.postedAt = new Date();
        this.applications = new ArrayList<>();
    }

    public  void apply(User user, String resumeUrl) {
        JobApplication application = new JobApplication(this, user, resumeUrl);
        applications.add(application);
        System.out.println(user.getName() + " applied for job: " + title);
    }

    // Getters
    public UUID getJobId() { return jobId; }
    public Company getPostedBy() { return postedBy; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public List<String> getRequirements() { return requirements; }
    public String getLocation() { return location; }
    public Date getPostedAt() { return postedAt; }
    public List<JobApplication> getApplications() { return applications; }
}

