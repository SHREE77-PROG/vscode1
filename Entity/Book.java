package com.example.rest1.demorest1.Entity;

public class Book {
    private int id;
    private String title;
    private String description;

    public Book (){

    }
    public Book(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Book [description=" + description + ", id=" + id + ", title=" + title + "]";
    }


    
    
}



