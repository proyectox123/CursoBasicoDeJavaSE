package com.mho.amazonviewer.model;

import java.util.Date;

public class Book {

    private int id;
    private String title;
    private Date editionDate;
    private String editorial;
    private String[] authors;
    private String isbn;
    private boolean read;
    private int timeRead;

    public Book(String title, Date editionDate, String editorial, String isbn) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }
}
