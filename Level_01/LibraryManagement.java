/*Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
*/

class Book {
    String title;
    String author;
    final int isbn;
    static String libraryName = "T.K. Library";

    // Constructor to initialize the book details
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display the book details
    public void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        
        // Creating three Book objects
        Book obj1 = new Book("My Life", "Tikesh K", 2022);
        Book obj2 = new Book("We Are Friends", "Abhay G", 2023);
        Book obj3 = new Book("How can we change our lives", "Amaan S", 2024);

        // Checking if obj1 is an instance of Book before displaying details
        if (obj1 instanceof Book) {
            System.out.println("Yes, this book is an instance of Book");
            obj1.displayLibraryName();
        }

        System.out.println();

        // Checking if obj2 is an instance of Book before displaying details
        if (obj2 instanceof Book) {
            System.out.println("Yes, this book is an instance of Book");
            obj2.displayLibraryName();
        }

        System.out.println();

        // Checking if obj3 is an instance of Book before displaying details
        if (obj3 instanceof Book) {
            System.out.println("Yes, this book is an instance of Book");
            obj3.displayLibraryName();
        }
    }
}
