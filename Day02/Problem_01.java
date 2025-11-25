public class Problem_01 {
    public static void main(String[] args)
    {
        int[] arr = {21, 24, 45, 12, 56, 80, 7};

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Maximum number is: " + max + " at index: " + maxIndex);
        System.out.println("Minimum number is: " + min + " at index: " + minIndex);
    }
}
