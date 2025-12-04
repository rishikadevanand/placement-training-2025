// To find the min and max element in the linked list
import java.util.Collections;
import java.util.LinkedList;
public class Problem_11
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
        int min = Collections.min(ll);
        int max = Collections.max(ll);
        System.out.println("Minimum element in the Linked List is : " +min);
        System.out.println("Maximum element in the Linked List is : " +max);
    }
}