package com.linkdin_platform;

import java.util.*;

public class Skill {
    private String name;
    private List<User> endorsedBy;

    public Skill(String name) {
        this.name = name;
        this.endorsedBy = new ArrayList<>();
    }

    public void addEndorsement(User user) {
        if (!endorsedBy.contains(user)) {
            endorsedBy.add(user);
            System.out.println(user.getName() + " endorsed skill: " + name);
        } else {
            System.out.println(user.getName() + " already endorsed skill: " + name);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<User> getEndorsedBy() {
        return endorsedBy;
    }

}

