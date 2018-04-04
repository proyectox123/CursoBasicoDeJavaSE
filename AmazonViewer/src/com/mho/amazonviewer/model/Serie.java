package com.mho.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{

    private int id;
    private int seasonQuantity;
    private ArrayList<Chapter> chapters;

    public Serie(String title, String genre, String creator, int duration, int seasonQuantity) {
        super(title, genre, creator, duration);
        this.seasonQuantity = seasonQuantity;
    }

    public int getId() {
        return id;
    }

    public int getSeasonQuantity() {
        return seasonQuantity;
    }

    public void setSeasonQuantity(int seasonQuantity) {
        this.seasonQuantity = seasonQuantity;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }
}
