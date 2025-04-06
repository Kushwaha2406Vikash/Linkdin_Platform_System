package com.linkdin_platform;

import java.util.Date;

public class Endorsement {
    private Skill skill;
    private User endorsedBy;
    private Date endorsedAt;

    // Constructor
    public Endorsement(Skill skill, User endorsedBy) {
        this.skill = skill;
        this.endorsedBy = endorsedBy;
        this.endorsedAt = new Date();  // current time
    }

    // Getters
    public Skill getSkill() {
        return skill;
    }

    public User getEndorsedBy() {
        return endorsedBy;
    }

    public Date getEndorsedAt() {
        return endorsedAt;
    }

    // toString for debugging or display
    @Override
    public String toString() {
        return endorsedBy.getName() + " endorsed " + skill.getName() + " on " + endorsedAt;
    }
}
