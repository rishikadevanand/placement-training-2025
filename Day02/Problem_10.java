import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[][] transpose = new int[n][n];

        // Input matrix
        System.out.println("Enter " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose logic: swap rows & columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print transpose
        System.out.println("Transpose of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
