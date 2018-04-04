package com.mho.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable{

    private int id;
    private String isbn;
    private boolean read;
    private int timeRead;

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial);
        setAuthors(authors);
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public int getTimeRead() {
        return timeRead;
    }

    public void setTimeRead(int timeRead) {
        this.timeRead = timeRead;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuilder detailBook = new StringBuilder("\n :: BOOK ::" +
                "\n Title: " + getTitle() +
                "\n Editorial: " + getEditorial() +
                "\n Edition Date: " + getEditionDate() +
                "\n Authors: ");
        for (int i = 0; i < getAuthors().length; i++) {
            detailBook.append("\t").append(getAuthors()[i]);
        }
        return detailBook.toString();
    }

    @Override
    public Date startToSee(Date initDate) {
        return initDate;
    }

    @Override
    public void stopToSee(Date initDate, Date finalDate) {
        if(finalDate.getTime() > initDate.getSeconds()){
            setTimeRead(finalDate.getSeconds() - initDate.getSeconds());
        }else{
            setTimeRead(0);
        }
    }
}
