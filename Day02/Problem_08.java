import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[][] result = new int[n][n];

        // Input matrix
        System.out.println("Enter " + n + "x" + n + " matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Square each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = arr[i][j] * arr[i][j];
            }
        }

        // Print result
        System.out.println("Resultant matrix (squares):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
