import java.util.ArrayList;
public class Problem_08
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1000);

        for (int i = 0; i < list.size(); i++) 
        {
            System.out.println(list.get(i));
        }
    }
}