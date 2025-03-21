Products-reliance Java

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String productName;
    double price;
    int quantity;

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class RelianceStore {

    // List to store products
    private ArrayList<Product> productList = new ArrayList<>();
    
    // Method to add a product to the store
    public void addProduct(String productName, double price, int quantity) {
        Product product = new Product(productName, price, quantity);
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    // Method to display all products in the store
    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available in the store.");
        } else {
            System.out.println("----- Available Products -----");
            for (Product product : productList) {
                product.displayProductDetails();
                System.out.println("-----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RelianceStore store = new RelianceStore();
        
        while (true) {
            // Menu for the user
            System.out.println("---- Reliance Store ----");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1/2/3): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Add Product
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ₹");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    store.addProduct(name, price, quantity);
                    break;
                
                case 2:
                    // Display Products
                    store.displayProducts();
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting... Thank you for using Reliance Store system.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
