import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[] common = new int[4]; // Max 4 elements
        int index = 0;

        // Input matrix 1
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input matrix 2
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Find common elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                for (int a = 0; a < 2; a++) {
                    for (int b = 0; b < 2; b++) {

                        if (mat1[i][j] == mat2[a][b]) {
                            common[index] = mat1[i][j];
                            index++;
                            break;
                        }

                    }
                }
            }
        }

        // Print common elements
        System.out.print("Common elements: ");
        if (index == 0) {
            System.out.println("No common elements.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.print(common[i] + " ");
            }
        }

        sc.close();
    }
}
