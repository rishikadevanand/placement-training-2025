
import java.util.Stack;

public class Problem_03
{
    public static void main(String[] args)
    {
        Stack <String> s1 = new Stack<>();
        s1.push("helloo");
        s1.push("Java");
        s1.push("Programming");

        System.out.println("Elements in Stact are :" +s1);
        System.out.println("Last element is : " +s1.peek());
        System.out.println("Removing Last element : " +s1.pop());
        System.out.println("Elements in Stact are :" +s1);
    }
}