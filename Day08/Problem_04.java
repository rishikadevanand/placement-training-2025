public class Problem_04
{
    public static void main(String[] args) 
    {
        int x = 100;

        Integer t = Integer.valueOf(x);

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toUnsignedLong(x));
        System.out.println(Integer.toUnsignedString(x));

        
    }
}