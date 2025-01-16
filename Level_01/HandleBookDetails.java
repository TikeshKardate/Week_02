/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. 
Add a method to display the book details.
*/

class Book {
   String title;
   String author;
   int price;

    public Book (String title, String author , int price ) {
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void displayBookDetails() {
        System.out.println("Title : " +title );
        System.out.println("Author : " +author );
        System.out.println("Price : " +price );
        
    }
}

public class HandleBookDetails {
    public static void main(String[] args) {
        
    
   Book handle = new Book("Ignited Minds","Dr. APJ Abdul Kalam",300);
        handle.displayBookDetails();
    }
}