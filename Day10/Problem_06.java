import java.util.*;
public class Problem_06
{
    public static void main(String[] args)
    {
        Stack <String> colour = new Stack<>();
        colour.addAll(Arrays.asList("Red","Green","Blue","Yellow","White"));

        colour.forEach(System.out::println);
    }
}
