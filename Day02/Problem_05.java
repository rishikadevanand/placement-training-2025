public class Problem_05 {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int size = arr1.length + arr2.length;

        int[] merged = new int[size];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }

        System.out.print("Merged array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
