import java.util.Stack;
public class Problem_05
{
    public static void main(String[] args)
    {
        String str = "HelloWorld";
        Stack <Character> s1 = new Stack<>();

        for(char ch : str.toCharArray())
        {
            s1.push(ch);
        } 
        
        String reversedStr = "";
        while(!s1.isEmpty()) {
            reversedStr += s1.pop();
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}