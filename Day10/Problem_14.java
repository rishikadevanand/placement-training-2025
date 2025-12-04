// To clone a Linked List
import java.util.LinkedList;
public class Problem_14
{
    public static void main(String[] args)
    {
        LinkedList <String> ll1 = new LinkedList<>();
        ll1.add("Red");
        ll1.add("Green");
        ll1.add("Blue");
        ll1.add("Yellow");

        System.out.println("Elements in original Linked List are :" +ll1);

        LinkedList <String> ll2 = (LinkedList<String>) ll1.clone();

        System.out.println("Elements in cloned Linked List are :" +ll2);
    }
}