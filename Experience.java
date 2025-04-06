package com.linkdin_platform;

import java.util.Date;

public class Experience {
    private String company;
    private String title;
    private Date startDate;
    private Date endDate;
    private String description;

    public Experience(String company,String title,Date startDate,Date endDate, String description) {
        this.company = company;
        this.title=title;
        this.startDate=startDate;
        this.endDate=endDate;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }
}

