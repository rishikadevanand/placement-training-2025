import java.util.*;
public class Problem_01
{
    public static void main(String[] args) 
    {
      Vector <Integer> v = new Vector<>(Arrays.asList(3,5,7,9,6));
      int constant = 29;
      for(int i =0 ; i<v.size();i+=2)
      {
        v.add(i,constant);
      }
      System.out.println(v);
    }    
}
