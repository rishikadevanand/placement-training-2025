// program to add elements in linked list and to reverse the linked list
import java.util.Collections;
import java.util.LinkedList;
public class Problem_09
{
    public static void main(String[] args)
    {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        ll.add(55);

        System.out.println("Elements in Linked List are :" +ll);
        Collections.reverse(ll);
        System.out.println("Elements in Linked List after reversing are :" +ll);
    }
}