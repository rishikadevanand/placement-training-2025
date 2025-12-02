import java.util.*;
public class Problem_09
{
    public static void main(String[] args)
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);                                  
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(90);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        
        System.out.println(max);
        System.out.println(min);

         
        
    }
}