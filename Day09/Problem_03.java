import java.util.*;
public class Problem_03 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,23,34,65));

        num.forEach(n -> System.out.println(n));
        // print each element

        final int[] sum = {0};
        num.forEach(n-> sum[0] += n);
        // using forEach loop for sum

        System.out.println("Sum : " + sum[0]);

    }
}
