import java.util.*;
public class Problem_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(79);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}
