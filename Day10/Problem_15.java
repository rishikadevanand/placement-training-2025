// To check wether the element i spresent in the Linked List or not
import java.util.LinkedList;
public class Problem_15
{
    public static void main(String[] args)
    {
        LinkedList <String> ll = new LinkedList<>();
        ll.add("Dog");
        ll.add("Cat");
        ll.add("Elephant");
        ll.add("Tiger");

        System.out.println("Elements in Linked List are :" +ll);
        
        String elementToCheck = "Cat";
        if(ll.contains(elementToCheck))
        {
            System.out.println(elementToCheck + " is present in the Linked List.");
        }
        else
        {
            System.out.println(elementToCheck + " is not present in the Linked List.");
        }
    }
}