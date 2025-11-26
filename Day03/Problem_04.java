// Base class
class Vehicle {

    protected String brand;      // protected property
    protected int speed;         // protected property

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    protected void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/hr");
    }
}

// Subclass 1
class Car extends Vehicle {

    Car(String brand, int speed) {
        super(brand, speed);  // call parent constructor
    }

    void showCarDetails() {
        System.out.println("---- Car Details ----");
        displayInfo();        // accessing protected parent method
    }
}

// Subclass 2
class Bike extends Vehicle {

    Bike(String brand, int speed) {
        super(brand, speed);
    }

    void showBikeDetails() {
        System.out.println("---- Bike Details ----");
        displayInfo();        // accessing protected parent method
    }
}

public class Problem_04 {
    public static void main(String[] args) {

        Car c = new Car("BMW", 220);
        c.showCarDetails();

        System.out.println();

        Bike b = new Bike("Yamaha", 150);
        b.showBikeDetails();
    }
}
