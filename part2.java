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

class Fabric {
    private String id;
    private String type;
    private String color;
    private double pricePerMeter;

    public Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    public double calculateCost(double meters) {
        return pricePerMeter * meters;
    }

    public String getType() { return type; }
}

class Supplier {
    private String id;
    private String name;
    private String contactInfo;
    private List<Fabric> suppliedFabric = new ArrayList<>();

    public Supplier(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void addFabric(Fabric fabric) {
        suppliedFabric.add(fabric);
    }

    public List<Fabric> getSuppliedFabrics() {
        return suppliedFabric;
    }

    public void displaySupplierInfo() {
        System.out.println("Supplier ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }
}

