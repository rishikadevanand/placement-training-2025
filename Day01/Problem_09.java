import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.next().trim();

        if (input.startsWith("-")) input = input.substring(1);

        int[] freq = new int[10];
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                freq[c - '0']++;
            }
        }

        System.out.println("Digit frequencies:");
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                System.out.println(d + " -> " + freq[d]);
            }
        }
        sc.close();
    }
}
