
import java.util.Stack;

public class Problem_04
{
    public static void main(String[] args)
    {
        Stack <Integer> s1 = new Stack<>();
        s1.push(12);
        s1.push(34);
        s1.push(56);
        s1.push(78);
        s1.push(89);


        System.out.println("Elements in Stact are :" +s1);
        System.out.println(s1.search(89));

    }
}