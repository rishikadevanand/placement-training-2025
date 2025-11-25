public class Problem_14 {
    public static void main(String[] args) {

        int n = 10;   // number of terms you want

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
