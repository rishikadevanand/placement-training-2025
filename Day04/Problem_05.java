class BankAccount {
    void showDetails() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    void showDetails() {
        System.out.println("Savings Account Details");
    }

    void savingsOnly() {
        System.out.println("Savings: Interest applied");
    }
}

class CurrentAccount extends BankAccount {
    void showDetails() {
        System.out.println("Current Account Details");
    }

    void currentOnly() {
        System.out.println("Current: Overdraft facility");
    }
}

public class Problem_05 {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount();  // Upcasting
        BankAccount acc2 = new CurrentAccount();  // Upcasting

        acc1.showDetails();  // Calls Savings
        acc2.showDetails();  // Calls Current

        // Downcasting
        SavingsAccount s1 = (SavingsAccount) acc1;
        s1.savingsOnly();

        CurrentAccount c1 = (CurrentAccount) acc2;
        c1.currentOnly();
    }
}
