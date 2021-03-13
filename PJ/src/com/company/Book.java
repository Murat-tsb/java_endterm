package com.company;

import java.util.UUID;

public class Book {
    private UUID book_uuid;
    private String title;
    private String author;
    private int lending_period;

    public Book(String title, String author) {
        setAuthor(author);
        setTitle(title);
    }

    public UUID getBook_uuid() {
        return UUID.randomUUID();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getTitle() + " by " + getAuthor();
    }
}
