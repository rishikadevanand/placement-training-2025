public class Problem_11 {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {6}
        };

        // find the longest row
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > max) {
                max = arr[i].length;
            }
        }

        // transpose printing
        System.out.println("Transpose:");
        for (int col = 0; col < max; col++) {
            for (int row = 0; row < arr.length; row++) {

                // print only if the element exists
                if (col < arr[row].length) {
                    System.out.print(arr[row][col] + " ");
                }

            }
            System.out.println();
        }
    }
}
