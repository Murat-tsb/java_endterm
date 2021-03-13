package com.company;

import java.util.List;

public interface IBookRepository {
    boolean addBook(Book book);
    boolean removeBook(Book book);
    List<Book> getAllBooks();
    Book getBook(String title, String author);
}