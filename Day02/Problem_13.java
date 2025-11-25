class Vehicle {
    void engine() {
        System.out.println("Vehicle has an engine");
    }
}

class Car extends Vehicle {
    // overriding
    void engine() {
        System.out.println("Car engine: 1200cc petrol engine");
    }
}

class Bike extends Vehicle {
    // overriding
    void engine() {
        System.out.println("Bike engine: 150cc single-cylinder engine");
    }
}

public class Problem_13 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.engine();

        Vehicle v2 = new Car();
        v2.engine();

        Vehicle v3 = new Bike();
        v3.engine();
    }
}
