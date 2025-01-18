
class Products{
    String productName;
    int Price;
    static int totalProducts=0;
    public Products(String productName, int Price){
        this.productName = productName;
        this.Price = Price;
        totalProducts++;
    }
    public void display(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: "+Price);
    }
    public void displayTotalProducts(){
        System.out.println("Total "+totalProducts+" no of products are created");
    }
}

 public class ProductsInventory{
    public static void main(String[] args){
        Products p1 = new Products("Samsung-Phone", 500000);
        p1.display();
        p1.displayTotalProducts();
        Products p2 = new Products("Motorola-Phone", 20000);
        p2.display();
        p2.displayTotalProducts();
        Products p3 = new Products("I-Phone", 10000);
        p3.display();
        p3.displayTotalProducts();
    }

}