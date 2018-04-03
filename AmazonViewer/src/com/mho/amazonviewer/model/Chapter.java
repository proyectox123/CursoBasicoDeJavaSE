package com.mho.amazonviewer.model;

public class Chapter {

    private int id;
    private String title;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    private int seasonNumber;

    public Chapter(String title, int duration, short year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }
}
