import java.util.Scanner;

public class Problem_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = "";

        // reverse the string manually
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // compare
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        sc.close();
    }
}
