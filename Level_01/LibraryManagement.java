/*
Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
*/

// Imports the utility package to import the Array list
import java.util.ArrayList ;

// Class representing a book
class Book {

    // Private member variables for author and title
    private String author ;
    private String title ;

    // Constructor to initialize the book with author and title
    public Book(String author , String title) {
        this.author = author ;
        this.title = title ;
    }

    // Getter method for author
    public String getAuthor() {
        return author ;
    }

    // Getter method for title
    public String getTitle() {
        return title ;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + " Author: " + author);
    }
}

// Class representing a library
class Library {

    // Aggregation: A library contains multiple books
    private String libraryName;
    private ArrayList<Book> books; 

    // Constructor to initialize a library with a name
    public Library(String libraryName) {
        this.libraryName = libraryName;

        // Initialize the book list
        this.books = new ArrayList<>();  
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to " + libraryName);
    }

    // Method to display all books in the library
    public void displayLibraryBooks() {
        System.out.println("\nBooks in " + libraryName + ":");

        // Iterate through the list of books and display their details
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            
            book.displayBookDetails(); // Display the details of the book
        }
    }

    // Method to get library name
    public String getName() {
        return libraryName;
    }
}

// Main class to manage the library system
public class LibraryManagement {
    public static void main(String[] args) {

        // Creating book instances
        Book book1 = new Book("Tikesh", "My Life");
        Book book2 = new Book("Abhay", "Where Am I ?");
        Book book3 = new Book("Amaan", "We are Friends");
        Book book4 = new Book("Nishank", "The Hustlers");

        // Creating library instances
        Library library1 = new Library("TIKESH Library");
        Library library2 = new Library("KARDATE Library");

        // Adding books to the first library
        library1.addBook(book1);
        library1.addBook(book2);

        // Adding books to the second library
        library2.addBook(book3);
        library2.addBook(book4);

        // Displaying books in the first library
        library1.displayLibraryBooks();

        // Displaying books in the second library
        library2.displayLibraryBooks();
    }
}
