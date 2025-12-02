import java.util.*;
public class Problem_05
{
    public static void main(String[] args)
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(23);       //autoboxing
        list.add(34);
        list.add(45);

        int sum = 0;

        for(Integer n  : list)   // primitive to wrapper
        {
            sum += n;            // unboxing
            
        }
        System.out.println("Sum : " +sum); 
        
    }
}