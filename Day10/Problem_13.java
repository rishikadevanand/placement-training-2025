// To merge two linked lists
import java.util.LinkedList;
public class Problem_13
{
    public static void main(String[] args)
    {
        LinkedList <Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);

        LinkedList <Integer> ll2 = new LinkedList<>();
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);
        ll2.add(9);
        ll2.add(10);

        System.out.println("Elements in first Linked List are :" +ll1);
        System.out.println("Elements in second Linked List are :" +ll2);

        ll1.addAll(ll2);

        System.out.println("Elements in merged Linked List are :" +ll1);
    }
}