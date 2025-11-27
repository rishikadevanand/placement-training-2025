class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayCar() {
        displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasDiscBrake;

    Bike(String brand, String model, int year, boolean hasDiscBrake) {
        super(brand, model, year);
        this.hasDiscBrake = hasDiscBrake;
    }

    void displayBike() {
        displayInfo();
        System.out.println("Disc Brake: " + (hasDiscBrake ? "Yes" : "No"));
    }
}

public class Problem_01 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Innova", 2022, 4);
        Bike bike = new Bike("Yamaha", "MT-15", 2023, true);

        System.out.println("Car Details:");
        car.displayCar();

        System.out.println("\nBike Details:");
        bike.displayBike();
    }
}
