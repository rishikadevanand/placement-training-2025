public class Problem_01
{
    public static void main(String[] args)
    {
        int a = 34;                    //boxing 
        Integer obj = Integer.valueOf(a);
        System.out.println(obj);

        int b = 68;                    //auto boxing
        Integer b1 = b;
        System.out.println(b1);

        Integer c = Integer.valueOf(68);
        int c1 = c.intValue();          // UnBoxing 
        System.out.println(c1);

        Integer d = Integer.valueOf(87);
        int d1 = d;                      // Auto UnBoxing
        System.out.println(d1);


    } 
}