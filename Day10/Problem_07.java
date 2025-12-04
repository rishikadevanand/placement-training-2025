import java.util.Stack;
public class Problem_07
{
    // To convert the given decimal number to binary number using stack
    public static void main(String[] args)
    {
        int num = 10;
        Stack<Integer> stack = new Stack<>();

        // Convert decimal to binary and push remainders onto the stack
        while (num > 0)
        {
            int remainder = num % 2;
            stack.push(remainder);
            num = num / 2;
        }

        // Pop elements from the stack to get the binary representation
        System.out.print("Binary representation: ");
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
    } 
}