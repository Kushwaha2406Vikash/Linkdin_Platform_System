package com.linkdin_platform;

import java.util.Date;

public class Recommendation {
    private User recommendedBy;
    private String text;
    private Date createdAt;

    public Recommendation(User recommendedBy, String text) {
        this.recommendedBy = recommendedBy;
        this.text = text;
        this.createdAt = new Date();
    }

    // Getters
    public User getRecommendedBy() {
        return recommendedBy;
    }

    public String getText() {
        return text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}


