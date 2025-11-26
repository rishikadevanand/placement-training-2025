// Base class
class BankAccount {

    String holderName;        // default access
    private long accountNumber;
    private double balance;
    protected String bankName;

    public BankAccount(String holderName, long accountNumber, double balance, String bankName) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    // public getter methods for accessing private variables
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // public method to print basic account details
    public void displayDetails() {
        System.out.println("Account Holder : " + holderName);
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Balance        : " + getBalance());
    }
}

// Subclass that can access protected members
class SavingsAccount extends BankAccount {

    public SavingsAccount(String holderName, long accountNumber, double balance, String bankName) {
        super(holderName, accountNumber, balance, bankName);
    }

    public void showBank() {
        System.out.println("Accessing protected bank name from subclass: " + bankName);
    }
}

public class Problem_05 {
    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount("Pranesh", 12345678901L, 5000.0, "Indian Bank");

        acc.displayDetails();   // public method
        acc.showBank();         // protected accessed via subclass
    }
}
