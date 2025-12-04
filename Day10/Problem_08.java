// Basic operations in Linked List
import java.util.LinkedList;
public class Problem_08
{
    public static void main(String[] args)
    {
        LinkedList <String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Cherry");
        ll.add("Date");

        System.out.println("Elements in Linked List are :" +ll);
        System.out.println("First element is : " +ll.getFirst());
        System.out.println("Removing First element : " +ll.removeFirst());
        System.out.println("Elements in Linked List are :" +ll);
        System.out.println("Last element is : " +ll.getLast());
        System.out.println("Removing Last element : " +ll.removeLast());
        System.out.println("Elements in Linked List are :" +ll);
    }
}