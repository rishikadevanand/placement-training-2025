// Distinct class names to avoid conflict with Problem_01
class VehicleX {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class CarX extends VehicleX {
    void start() {
        System.out.println("Car is starting...");
    }

    void carOnlyFeature() {
        System.out.println("Car has AC and Music System");
    }
}

public class Problem_06 {
    public static void main(String[] args) {

        VehicleX v = new CarX();  // Upcasting
        v.start();                // Calls CarX's start()

        CarX c = (CarX) v;        // Downcasting
        c.start();
        c.carOnlyFeature();
    }
}
