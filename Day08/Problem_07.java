public class Problem_07
{
    public static void main(String[] args) 
    {
        String s1 = "20";
        String s2 = "30";
        String s3 = "40";

        Integer i1 = Integer.valueOf(s1);  
        int x1 = Integer.parseInt(s1); 

        Integer i2 = Integer.valueOf(s2); 
        int x2 = Integer.parseInt(s2); 

        Integer i3 = Integer.valueOf(s3);
        int x3 = Integer.parseInt(s3); 

        int avg = x1+x2+x3;
        int total = avg/3;

        System.out.println(total);
        
    }
}