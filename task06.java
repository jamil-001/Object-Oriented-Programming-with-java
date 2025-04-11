
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class Electronics extends Product {
    private int warrantyInMonths;

    public Electronics(String name, double price, int quantity, int warrantyInMonths) {
        super(name, price, quantity);
        this.warrantyInMonths = warrantyInMonths;
    }
    public double calculateTotalCost() {
        return super.calculateTotalCost() * 1.10;
    }
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty: " + warrantyInMonths + " months");
        System.out.println("Total Cost (with electronics fee): $" + calculateTotalCost());
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    public double calculateTotalCost() {
        return super.calculateTotalCost();
    }
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
// ShoppingCartTest
public class task06 {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 1000.0, 1, 24);
        Product tshirt = new Clothing("T-Shirt", 25.0, 3, "M");

        System.out.println("=== Electronics ===");
        laptop.displayProductInfo();

        System.out.println("\n=== Clothing ===");
        tshirt.displayProductInfo();
    }
}
