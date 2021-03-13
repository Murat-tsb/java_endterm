package com.company;


import java.util.Scanner;

public class MyApplication {
    private final BookController bookController;
    private final StudentController studentController;
    private final Scanner scanner;

    //constructors
    public MyApplication(IBookRepository bookRepository,
                         IStudentRepository studentRepository) {
        bookController = new BookController(bookRepository);
        studentController = new StudentController(studentRepository);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            //there is a 2 ways to log in: as the librarian and as a student
            System.out.println();
            System.out.println("Welcome to my application!");
            System.out.println("Log in as");
            System.out.println("1. As Librarian");
            System.out.println("2. As Student");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter option: ");
                int option = scanner.nextInt();
                if (option == 1) {
                    librarianMenu();
                } else if (option == 2) {
                    studentMenu();
                } else {
                    System.exit(0);
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next();
            }

            System.out.println("***********************************");
        }
    }

    public void librarianMenu() {
        while (true) {
            System.out.println();
            System.out.println("Select option");
            System.out.println("1. Go to books");
            System.out.println("2. Go to students");
            System.out.println("3. Main menu");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter option: ");
                int option = scanner.nextInt();
               if (option == 1) {
                    bookMenu();
                } else if (option == 2) {
                    librarianStudentMenu();
                } else if(option==3) {
                    start();
                }
                else {
                    System.exit(0);
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next();
            }

            System.out.println("***********************************");
        }
    }

    public void studentMenu() {
        while (true) {
            System.out.println();
            System.out.println("Select option");
            System.out.println("1. View books");
            System.out.println("2. Search book");
            System.out.println("3. Main menu");
            System.out.println("0. Exit");
            try {
                System.out.println("Enter option: ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllBooks();
                } else if (option == 2) {
                    getBook();
                } else if(option==3) {
                    start();
                }
                else {
                    System.exit(0);
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next();
            }

            System.out.println("***********************************");
        }
    }

    public void bookMenu() {
        while (true) {
            System.out.println();
            System.out.println("Select option");
            System.out.println("1. Add book");
            System.out.println("2. Get book");
            System.out.println("3. Remove book");
            System.out.println("4. View all books");
            System.out.println("5. Main menu");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter option (0-5): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    addBook();
                } else if (option == 2) {
                    getBook();
                } else if (option == 3) {
                    removeBook();
                } else if (option == 4) {
                    getAllBooks();
                } else if(option==5) {
                    start();
                }
                else {
                    System.exit(0);
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next();
            }

            System.out.println("***********************************");
        }
    }

    //student menu for the librarian
    public void librarianStudentMenu() {
        while (true) {
            System.out.println();
            System.out.println("Select option");
            System.out.println("1. Add student");
            System.out.println("2. Get student");
            System.out.println("3. Remove student");
            System.out.println("4. Get students");
            System.out.println("5. Main menu");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.println("Enter option: ");
                int option = scanner.nextInt();
                if (option == 1) {
                    addStudent();
                } else if (option == 2) {
                    getStudent();
                } else if (option == 3) {
                    removeStudent();
                } else if (option == 4) {
                    getAllStudents();
                } else if(option==5) {
                    start();
                }
                else {
                    System.exit(0);
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next();
            }

            System.out.println("***********************************");
        }
    }

    public void addBook() {
        System.out.println("Please enter title");
        String title = scanner.next();
        title += scanner.nextLine();

        System.out.println("Please enter author name:");
        String author = scanner.next();
        author += scanner.nextLine();

        String response = bookController.addBook(title, author);
        System.out.println(response);
    }

    public void removeBook() {
        System.out.println("Please enter title of the book");
        String title = scanner.next();
        System.out.println("Please enter the name of the author");
        String author = scanner.next();

        String response =bookController.removeBook(title, author);
        System.out.println(response);
    }

    public void removeStudent() {
        System.out.println("Please enter name of the student you want to remove");
        String name = scanner.next();
        name += scanner.nextLine();

        String response = studentController.removeStudent(name);
        System.out.println(response);
    }

    public void getBook() {
        System.out.println("please enter title");
        String title = scanner.next();
        title += scanner.nextLine();

        System.out.println("author");
        String author = scanner.next();
        author += scanner.nextLine();
        String response = bookController.getBook(title, author);
        System.out.println(response);
    }

    public void addStudent() {
        System.out.println("Please enter name of the student");
        String name = scanner.next();
        name += scanner.nextLine();

        String response = studentController.createStudent(name);
        System.out.println(response);
    }


    public void getStudent() {
        System.out.println("please enter name of the student");
        String name = scanner.next();
        name += scanner.nextLine();

        String response = studentController.getStudent(name);
        System.out.println(response);
    }

    public void getAllStudents() {
        String response = studentController.getAllStudents();
        System.out.println(response);
    }


    public void getAllBooks() {
        String response = bookController.getAllBooks();
        System.out.println("\n");
        System.out.println(response);
    }

}

