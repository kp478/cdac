package Assignment_6;

import java.util.ArrayList;
import java.util.Scanner;

public class que1 {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class User {
    private int userId;
    private String name;
    private ArrayList<Integer> booksBorrowed;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.booksBorrowed = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void borrowBook(int bookId) {
        booksBorrowed.add(bookId);
    }

    public void returnBook(int bookId) {
        booksBorrowed.remove(Integer.valueOf(bookId));
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Book> availableBooks = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBooks();
        displayMenu();
    }

    private static void initializeBooks() {
        availableBooks.add(new Book(201, "Java Programming", "John Doe"));
        availableBooks.add(new Book(202, "Python Basics", "Jane Smith"));
        availableBooks.add(new Book(203, "Data Structures", "Alice Johnson"));
    }

    private static void displayMenu() {
        System.out.println("Welcome to the Virtual Library Management System!");
        System.out.println("1. Borrow a Book");
        System.out.println("2. Return a Book");
        System.out.println("3. Display Available Books");
        System.out.println("4. Display Borrowed Books");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    borrowBook();
                    break;
                case 2:
                    returnBook();
                    break;
                case 3:
                    displayAvailableBooks();
                    break;
                case 4:
                    displayBorrowedBooks();
                    break;
                case 5:
                    System.out.println("Exiting Virtual Library Management System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (choice != 5);
    }

    private static void borrowBook() {
        System.out.print("Enter your user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter the book ID you want to borrow: ");
        int bookId = scanner.nextInt();

        Book book = findBookById(bookId);
        if (book != null && book.isAvailable()) {
            User user = findUserById(userId);
            if (user != null) {
                user.borrowBook(bookId);
                book.setAvailable(false);
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("User not found.");
            }
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter your user ID: ");
        int userId = scanner.nextInt();
        System.out.print("Enter the book ID you want to return: ");
        int bookId = scanner.nextInt();

        Book book = findBookById(bookId);
        if (book != null && !book.isAvailable()) {
            User user = findUserById(userId);
            if (user != null && user.getBooksBorrowed().contains(bookId)) {
                user.returnBook(bookId);
                book.setAvailable(true);
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Book not borrowed by this user.");
            }
        } else {
            System.out.println("Book is already available or not found.");
        }
    }

    private static void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            if (book.isAvailable()) {
                System.out.println("Book ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }
    }

    private static void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (User user : users) {
            System.out.println("User ID: " + user.getUserId() + ", Name: " + user.getName() + ", Books Borrowed: " + user.getBooksBorrowed());
        }
    }

    private static Book findBookById(int bookId) {
        for (Book book : availableBooks) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    private static User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}
