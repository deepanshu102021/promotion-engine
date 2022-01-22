package com.example.promotionengine.model;

import java.sql.Timestamp;

public class Schedule {

    private Boolean allDays;
    private Days[] specificDays;
    private Timestamp startDateTime;
    private Timestamp endDateTime;
    private String validFrom;
    private String validTo;

    private enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    public Boolean getAllDays() {
        return allDays;
    }

    public void setAllDays(Boolean allDays) {
        this.allDays = allDays;
    }

    public Days[] getSpecificDays() {
        return specificDays;
    }

    public void setSpecificDays(Days[] specificDays) {
        this.specificDays = specificDays;
    }

    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
}
