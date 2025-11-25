public class Problem_15 {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;  // number of terms

        System.out.print("Fibonacci Series (Recursion): ");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
