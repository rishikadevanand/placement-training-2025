class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting...");
    }

    void carOnlyFeature() {
        System.out.println("Car has AC and Music System");
    }
}

public class Problem_06
 {
    public static void main(String[] args) {

        // Upcasting (Car → Vehicle reference)

        Vehicle v = new Car();
        v.start();             // Calls Car’s start() because object is Car

        //Downcasting (Vehicle → Car)

        Car c = (Car) v;

        c.start();           // Calls Car’s start()
        c.carOnlyFeature();  // Now we can access Car specific method
    }
}
