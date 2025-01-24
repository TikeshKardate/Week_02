/*
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/

// Superclass: Book
class Book {
    // Attributes for title and publication year
    String title;
    int publicationYear;

    // Constructor to initialize the attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display information about the book
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    // Additional attributes for Author
    String name;
    String bio;

    // Constructor to initialize attributes of Book and Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to test the Library Management system
public class LibraryManagement {
    public static void main(String[] args) {

        System.out.println("\"Book Details\"\n");

        // Creating an instance of Author
        Book author = new Author("we Are Friends", 2002, "Tikesh Kardate", "An Indian novelist and short story writer.");

        // Displaying information about the book and its author
        author.displayInfo();
    }
}
