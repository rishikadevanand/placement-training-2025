import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is a HARSHAD number.");
        } else {
            System.out.println(original + " is NOT a Harshad number.");
        }

        sc.close();
    }
}
