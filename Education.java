package com.linkdin_platform;

import java.util.Date;

public class Education {
    private String institution;
    private String degree;
    private Date startDate;
    private Date endDate;

    public Education(String institution,String degree,Date startDate, Date endDate) {
        this.institution = institution;
        this.degree=degree;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public String getInstitution() {
        return institution;
    }

    public String getDegree() {
        return degree;
    }
}

