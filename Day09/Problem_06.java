import java.util.*;
public class Problem_06 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(79);

        Iterator<Integer> itr = list.iterator();

        if(list % 2 == 0)
        {
            itr.remove();
        }
        else
        {
            System.out.println("Odd Elements : " + itr.next());
        }

    }
}
