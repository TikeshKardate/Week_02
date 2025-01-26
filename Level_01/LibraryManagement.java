/*
5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
 */

interface Reservable{
    public void reserveItem();
    public void checkAvailability();
}
abstract class LibraryItem implements Reservable{
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    public abstract void getLoanDuration();
    public void getItemDetails(){
        System.out.println("Item ID is: "+ itemId);
        System.out.println("Item Title is: "+ title);
        System.out.println("Item Author is: "+ author);
    }
}
class Book extends LibraryItem implements Reservable{
   
    public Book(int itemId,String title,String author){
        super(itemId, title, author);
    }
    public void getLoanDuration(){
        System.out.println("Loan duration for book is 15 days");
    }
    public void reserveItem(){
        System.out.println("You can reserve this book");
    }
    public void checkAvailability(){
        System.out.println("This book is available");
    }
}
class Magazine extends LibraryItem implements Reservable{
    public Magazine(int itemId,String title,String author){
        super(itemId, title, author);
    }
    public void getLoanDuration(){
        System.out.println("Loan duration for magazine is 7 days");
    }
    public void reserveItem(){
        System.out.println("You can reserve this magazine");
    }
    public void checkAvailability(){
        System.out.println("This magazine is not for 7 days available");
    }
}
class DVD extends LibraryItem implements Reservable{
    public DVD(int itemId,String title,String author){
        super(itemId, title, author);
    }
    public void getLoanDuration(){
        System.out.println("Loan duration for DVD is 3 days");
    }
    public void reserveItem(){
        System.out.println("You can reserve this DVD");
    }
    public void checkAvailability(){
        System.out.println("This DVD is available for only 2 days ");
    }
}
public class LibraryManagement {
    public static void main(String[] args) {

        LibraryItem book=new Book(1, "We are Friends", "Tikesh");
        book.getItemDetails();
        book.getLoanDuration();
        book.reserveItem();
        book.checkAvailability();
        System.out.println();

        LibraryItem magazine=new Magazine(2, "Old Friends", "Amaan");
        magazine.getItemDetails();
        magazine.getLoanDuration();
        magazine.reserveItem();
        magazine.checkAvailability();
        System.out.println();
        
        LibraryItem dvd=new DVD(3, "Home", "Abhay");
        dvd.getItemDetails();
        dvd.getLoanDuration();
        dvd.reserveItem();
        dvd.checkAvailability();
    }
    
}