import java.util.*;

// A Class named Book is created
class Book{
    String title;
    String author;
    int price;

    // Default Constructor
    public Book(){
        this.title="My Life";
        this.author="Tikesh K.";
        this.price=600;
    }

    // Parameterized Constructor
    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    // Method to display the book details
    public void showDetails(){
        System.out.println("Book name  is : "+title);
        System.out.println("Author name is : "+author);
        System.out.println("Price of the book is : "+price);
    }

}

public class BookDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter Book title:  ");
        String title=sc.nextLine();

        System.out.print("Enter author name:  ");
        String author=sc.nextLine();

        System.out.print("Enter price of the book: ");
        int price=sc.nextInt();

        Book b1= new Book(title,author,price);
        b1.showDetails();

        Book b2=new Book();
        b2.showDetails();

       
    }
}