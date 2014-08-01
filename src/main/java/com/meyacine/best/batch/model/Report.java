package com.meyacine.best.batch.model;

/**
 * Model Class for the batch, the four field are the same as those defined in the csv file
 * 
 * @author meyacine
 * 
 */
public class Report {

    private String Date;
    private String Impressions;
    private String Clicks;
    private String Earning;

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getImpressions() {
        return Impressions;
    }

    public void setImpressions(String Impressions) {
        this.Impressions = Impressions;
    }

    public String getClicks() {
        return Clicks;
    }

    public void setClicks(String Clicks) {
        this.Clicks = Clicks;
    }

    public String getEarning() {
        return Earning;
    }

    public void setEarning(String Earning) {
        this.Earning = Earning;
    }

    public Report() {
    }

    public Report(String Date, String Impressions, String Clicks, String Earning) {
        this.Date = Date;
        this.Impressions = Impressions;
        this.Clicks = Clicks;
        this.Earning = Earning;
    }

}
