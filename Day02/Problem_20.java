class Stock {

    String itemName;
    int itemId;
    int quantity;

    // Constructor
    Stock(String name, int id, int qty) {
        itemName = name;
        itemId = id;
        quantity = qty;
    }

    // Method to add stock
    void addStock(int qty) {
        quantity += qty;
        System.out.println(qty + " items added.");
    }

    // Method to remove stock
    void removeStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed.");
        } else {
            System.out.println("Not enough stock to remove!");
        }
    }

    // Display details
    void display() {
        System.out.println("--- Stock Details ---");
        System.out.println("Item Name : " + itemName);
        System.out.println("Item ID   : " + itemId);
        System.out.println("Quantity  : " + quantity);
        System.out.println("----------------------");
    }
}

public class Problem_20 {
    public static void main(String[] args) {

        // Creating stock object with initial quantity
        Stock s1 = new Stock("Laptop", 101, 20);

        s1.display();

        s1.addStock(10);
        s1.display();

        s1.removeStock(5);
        s1.display();

        s1.removeStock(50); // shows insufficient message
    }
}
