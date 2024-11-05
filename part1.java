import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Garment {
    private String id;
    private String name;
    private String description;
    private String size;
    private String color;
    private double price;
    private int stockQuantity;

    public Garment(String id, String name, String description, String size, String color, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void updateStock(int quantity) {
        this.stockQuantity = quantity;
    }

    public double calculateDiscountPrice(double discountPercentage) {
        return price - (price * (discountPercentage / 100));
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("--------------------------");
    }
}
