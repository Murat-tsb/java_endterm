package com.company;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IBookRepository bookRepository = new BookRepository(db);
        IStudentRepository studentRepository = new StudentRepository(db);
        MyApplication app = new MyApplication(bookRepository, studentRepository);
        app.start();
    }
}
