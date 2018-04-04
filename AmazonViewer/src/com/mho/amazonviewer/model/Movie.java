package com.mho.amazonviewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable{

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    public void showData(){
//        System.out.println("Title: "+title);
//        System.out.println("Genre: "+genre);
//        System.out.println("Year: "+year);
    }

    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle()
                + "\nGenre: " + getGenre()
                + "\nYear: " + getYear()
                + "\nCreator: " + getCreator()
                + "\nDuration: " + getDuration();
    }

    @Override
    public Date startToSee(Date initDate) {
        return initDate;
    }

    @Override
    public void stopToSee(Date initDate, Date finalDate) {
        if(finalDate.getTime() > initDate.getSeconds()){
            setTimeViewed(finalDate.getSeconds() - initDate.getSeconds());
        }else{
            setTimeViewed(0);
        }
    }
}
