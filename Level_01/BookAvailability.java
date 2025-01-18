
import java.util.*;

// A class named Book is created
class Book{
    String title;
    String author;
    int price;
    static int availability=10;

    // Default Constructor
    public Book(){
        this.title="My Life";
        this.author="Tikesh K.";
        this.price=600;
    }

    // Method to borrow a book
    public String borrowBook(){
        if(availability>0){
            availability--;
            return "Book is borrowed successfully";
        }
        else{
            return "Book is not available";
        }
    }

    // Method to show the details
    public void showDetails(){
        System.out.println("Book name  is : "+title);
        System.out.println("author name is : "+author);
        System.out.println("Price of the book  is : "+price);
        System.out.println("Total "+availability+" books are available.");
    }

}



public class BookAvailability{
    public static void main(String[] args) {
        Book b= new Book();
        b.showDetails();
        while(true){
            Scanner sc=new Scanner (System.in);
            System.out.println("do you want to borrow a book?    (yes/no)");
            String choice=sc.nextLine();
            if(choice.equals("yes")){
                System.out.println(b.borrowBook());
                b.showDetails();
            }
            else{
                break;
            }
        }

       
    }
}
