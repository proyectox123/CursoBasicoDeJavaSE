package com.mho.amazonviewer.model;

import java.util.Date;

public class Magazine {

    private int id;
    private String title;
    private Date editionDate;
    private String editorial;
    private String[] authors;

    public Magazine(String title, Date editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }
}
