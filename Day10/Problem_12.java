// To find the min and max in linked list without using Collections.min() and Collections.max()
import java.util.LinkedList;
public class Problem_12
{
    public static void main(String[] args)
    {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(45);
        ll.add(12);
        ll.add(78);
        ll.add(23);
        ll.add(56);

        System.out.println("Elements in Linked List are :" +ll);
        
        int min = ll.get(0);
        int max = ll.get(0);
        
        for(int i = 1; i < ll.size(); i++)
        {
            if(ll.get(i) < min)
            {
                min = ll.get(i);
            }
            if(ll.get(i) > max)
            {
                max = ll.get(i);
            }
        }
        
        System.out.println("Minimum element in the Linked List is : " +min);
        System.out.println("Maximum element in the Linked List is : " +max);
    }
}
