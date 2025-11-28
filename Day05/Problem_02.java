import java.util.Scanner;

abstract class Payment {
    double amount;

    Payment(double amt) {
        this.amount = amt;
        System.out.println("Amount to be paid: " + amt);
    }
}

class Upipayment extends Payment {
    Upipayment(double amt) {
        super(amt);
        System.out.println("Paid using UPI Payment");
    }
}

class Cash extends Payment {
    Cash(double amt) {
        super(amt);
        System.out.println("Paid using Cash Payment");
    }
}

public class Problem_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        System.out.println("1. UPI Payment");
        System.out.println("2. Cash Payment");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Payment p = null;

        switch(choice) {
            case 1:
                p = new Upipayment(amt);
                break;
            case 2:
                p = new Cash(amt);
                break;
            default:
                System.out.println("Invalid choice");
        }

        if (p != null) {
            System.out.println("Payment Successful");
        } else {
            System.out.println("Payment Failed");
        }

        sc.close();
    }
}
