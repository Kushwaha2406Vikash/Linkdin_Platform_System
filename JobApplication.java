package com.linkdin_platform;

import java.util.Date;
import java.util.UUID;

public class JobApplication {
    public enum ApplicationStatus {
        APPLIED,
        INTERVIEWING,
        REJECTED,
        HIRED
    }

    private UUID applicationId;
    private Job job;
    private User applicant;
    private String resumeUrl;
    private Date appliedAt;
    private ApplicationStatus status;

    public JobApplication(Job job, User applicant, String resumeUrl) {
        this.applicationId = UUID.randomUUID();
        this.job = job;
        this.applicant = applicant;
        this.resumeUrl = resumeUrl;
        this.appliedAt = new Date();
        this.status = ApplicationStatus.APPLIED;
    }

    // Getters & Setters
    public UUID getApplicationId() { return applicationId; }
    public Job getJob() { return job; }
    public User getApplicant() { return applicant; }
    public String getResumeUrl() { return resumeUrl; }
    public Date getAppliedAt() { return appliedAt; }
    public ApplicationStatus getStatus() { return status; }
    public void setStatus(ApplicationStatus status) { this.status = status; }
}

