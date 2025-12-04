import java.util.*;
public class Problem_02{
    public static void main(String[] args)
    {
     Vector<String>v=new Vector<>(Arrays.asList("RISHI","PAVI","LAKSHU","LANZ","MONI"));
     String l="";
     for(String s:v){
        if(s.length()>l.length()){
            l=s;
        }
     }
     System.out.println("Longest word:"+l);
    }
}
