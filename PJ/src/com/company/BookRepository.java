package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    private final IDB db;

    public BookRepository(IDB db) {
        this.db = db;
    }

    //method for creating book
    @Override
    public boolean addBook(Book book) {
        Connection con = null;
        try{
            con = db.getConnection();
            String sql ="INSERT INTO books(book_id, title, author) VALUES (?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setObject(1, book.getBook_uuid());
            st.setString(2, book.getTitle());
            st.setString(3, book.getAuthor());

            boolean executed = false==st.execute();
            return executed;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "DELETE FROM books WHERE title = " + "\'" + book.getTitle() + "\'";
            PreparedStatement st = con.prepareStatement(sql);

            boolean executed = st.execute();
            return executed;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }



    @Override
    public List<Book> getAllBooks() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT title, author FROM books";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Book> books = new ArrayList<>();
            while (rs.next()) {
                Book book = new Book(
                        rs.getString("title"),
                        rs.getString("author"));

                books.add(book);
            }

            return books;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Book getBook(String title, String author) {
        return null;
    }

}
