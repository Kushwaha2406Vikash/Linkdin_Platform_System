package com.linkdin_platform;

import java.util.*;

public class Company {
    private UUID companyId;
    private String name;
    private String profile; // You can create a separate CompanyProfile class if needed
    private List<Job> jobsPosted;

    public Company(String name, String profile) {
        this.companyId = UUID.randomUUID();
        this.name = name;
        this.profile = profile;
        this.jobsPosted = new ArrayList<>();
    }

    public void postJob(Job job) {
        jobsPosted.add(job);
        System.out.println("Company " + name + " posted job: " + job.getTitle());
    }

    // Getters
    public UUID getCompanyId() { return companyId; }
    public String getName() { return name; }
    public String getProfile() { return profile; }
    public List<Job> getJobsPosted() { return jobsPosted; }
}

