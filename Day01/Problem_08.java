import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        int digits = 0;
        int temp = num;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        while (temp != 0) {
            int rem = temp % 10;

            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= rem;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an ARMSTRONG number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
