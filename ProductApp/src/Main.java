import Product.NewProduct;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Məhsul obyektləri yaradılır
        Product product1 = new Product(101, "Laptop", 1200.0, "Electronics");
        Product product2 = new Product(101, "Laptop", 1200.0, "Electronics");
        Product product3 = new Product(102, "Laptop", 1200.0, "Electronics");
          product3.ProductIdIsCount(product2);
          Product.NewProduct product6 = new Product.NewProduct();
        // equals() metodunu yoxlayaq
        System.out.println("Product1 və Product2 bərabərdir: " + product1.equals(product2)); // true
        System.out.println("Product1 və Product3 bərabərdir: " + product1.equals(product3)); // false
    }
    }
