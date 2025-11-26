public class Problem_09 {

    private int pin = 1234;   // Default PIN (private)
    private int attempts = 0; // Count wrong attempts

    // Method to change the PIN
    public void changePin(int oldPin, int newPin) {
        if (oldPin == pin) {
            pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            attempts++;
            System.out.println("Incorrect old PIN. Attempts: " + attempts);
        }
    }

    public static void main(String[] args) {

        Problem_09 account = new Problem_09();

        // Try changing PIN
        account.changePin(1111, 5555); // wrong
        account.changePin(1234, 5555); // correct
        account.changePin(1234, 8888); // correct again
    }
}
