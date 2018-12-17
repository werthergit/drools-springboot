package com.xu.drools.rule.arrange;

public class ArrangeInfo {

    public ArrangeInfo(String shift, String week, String day) {
        this.shift = shift;
        this.week = week;
        this.day = day;
    }

    /**
     * 班次：1早 中2 晚3  0休息
     */
    private String shift;

    /**
     * 周一至日：1-7
     */
    private String week;

    private String day;

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
