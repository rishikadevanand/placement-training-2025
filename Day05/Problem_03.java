import java.util.Scanner;

abstract class Transport {
    String name, destination;

    Transport(String name, String destination) {
        this.name = name;
        this.destination = destination;
    }

    abstract void bookTicket();  // abstract method
}

class Bus extends Transport {
    Bus(String name, String destination) {
        super(name, destination);
    }

    void bookTicket() {
        System.out.println("Bus ticket booked for " + name + " to " + destination);
    }
}

class Train extends Transport {
    Train(String name, String destination) {
        super(name, destination);
    }

    void bookTicket() {
        System.out.println("Train ticket booked for " + name + " to " + destination);
    }
}

class Flight extends Transport {
    Flight(String name, String destination) {
        super(name, destination);
    }

    void bookTicket() {
        System.out.println("Flight ticket booked for " + name + " to " + destination);
    }
}

public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Destination: ");
        String dest = sc.nextLine();

        System.out.println("Choose Transport:");
        System.out.println("1. Bus\n2. Train\n3. Flight");
        int choice = sc.nextInt();

        Transport t = null;

        if (choice == 1)
            t = new Bus(name, dest);
        else if (choice == 2)
            t = new Train(name, dest);
        else if (choice == 3)
            t = new Flight(name, dest);
        else
            System.out.println("Invalid Choice!");

        if (t != null) {
            t.bookTicket();
            System.out.println("Booking Successful!");
        }

        sc.close();
    }
}
