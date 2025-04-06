package com.linkdin_platform;

import java.util.*;

public class Profile {
    private UUID userId;
    private String headline;
    private String about;
    private List<Experience> experiences;
    private List<Education> education;
    private List<Skill> skills;
    private List<Recommendation> recommendations;
    private List<Endorsement> endorsements;




    // Constructor matching object usage
    public Profile(UUID userId) {
        this.userId = userId;
        this.headline = headline;
        this.about = about;
        this.experiences = new ArrayList<>();
        this.education = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.recommendations = new ArrayList<>();
        this.endorsements = new ArrayList<>();
    }

    // Add experience
    public void addExperience(Experience exp) {
        experiences.add(exp);
    }

    // Add education
    public void addEducation(Education edu) {
        education.add(edu);
    }

    // Add skill
    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    // Add recommendation
    public void addRecommendation(Recommendation rec) {
        recommendations.add(rec);
    }

    // Endorse a skill
    public void endorseSkill(Skill skill, User endorsedBy) {
        for (Skill s : skills) {
            if (s.getName().equalsIgnoreCase(skill.getName())) {
                s.addEndorsement(endorsedBy);
                endorsements.add(new Endorsement(skill, endorsedBy));
                break;
            }
        }
    }

    // Getters
    public UUID getUserId() {
        return userId;
    }

    public String getHeadline() {
        return headline;
    }

    public String getAbout() {
        return about;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public List<Education> getEducation() {
        return education;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public List<Endorsement> getEndorsements() {
        return endorsements;
    }
}


