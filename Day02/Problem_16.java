public class Problem_16 {
    public static void main(String[] args) {

        int n = 29;  // number to check
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {   // basic loop method
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is NOT a prime number");
        }
    }
}
