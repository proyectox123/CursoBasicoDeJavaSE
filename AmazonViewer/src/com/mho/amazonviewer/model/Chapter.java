package com.mho.amazonviewer.model;

public class Chapter extends Movie{

    private int id;
    private int seasonNumber;

    public Chapter(String title, String genre, String creator, int duration, short year, int seasonNumber) {
        super(title, genre, creator, duration, year);
        this.seasonNumber = seasonNumber;
    }
}
