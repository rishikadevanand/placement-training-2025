public class Problem_17 {

    // Recursive function to check prime
    static boolean isPrime(int n, int i) {

        // base cases
        if (n <= 1) return false;      // 0, 1 are not prime
        if (i == n) return true;       // reached end without finding divisor
        if (n % i == 0) return false;  // divisor found → not prime

        // recursive call to check next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        int n = 29;  // number to check

        if (isPrime(n, 2)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is NOT a prime number");
        }
    }
}
