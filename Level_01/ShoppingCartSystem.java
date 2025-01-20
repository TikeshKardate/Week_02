/*Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
*/

class Product {
    String productName;
    int price;
    int quantity;
    final int productID;
    static double discount = 10;

    // Constructor to initialize the Product details
    public Product(String productName, int price,int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity=quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount){
        discount=newDiscount;
    }

    // Method to display the Product details
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Product ID : " + productID);
        System.out.println("Discount : "+discount+"%");
        
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {

        System.out.println("Initial Discount is : "+Product.discount);

        Product.updateDiscount(20);
        System.out.println("Updated discount is : "+Product.discount);

        System.out.println();

        // Creating three Product objects
        Product obj1 = new Product("Dairy Milk", 20 ,2, 11111);
        Product obj2 = new Product("Maggi", 30,2,22222);
        Product obj3 = new Product("Wafers", 10, 3,33333);

        // Checking if obj1 is an instance of Product before displaying details
        if (obj1 instanceof Product) {
            System.out.println("Yes, this Product is an instance of Product.");
            obj1.displayProductDetails();
        }

        System.out.println();

        // Checking if obj2 is an instance of Product before displaying details
        if (obj2 instanceof Product) {
            System.out.println("Yes, this Product is an instance of Product.");
            obj2.displayProductDetails();
        }

        System.out.println();

        // Checking if obj3 is an instance of Product before displaying details
        if (obj3 instanceof Product) {
            System.out.println("Yes, this Product is an instance of Product.");
            obj3.displayProductDetails();
        }
    }
}
