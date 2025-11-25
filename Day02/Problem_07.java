import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] result = new int[3][3];

        // Input matrix 1
        System.out.println("Enter elements of first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input matrix 2
        System.out.println("Enter elements of second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Add element-wise
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print result
        System.out.println("Resultant 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
