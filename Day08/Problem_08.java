public class Problem_08
{
    public static void main(String[] args) 
    {
        Integer number = Integer.valueOf(10);
        int i1 = number.intValue();
        Integer number1 = Integer.valueOf(20);
        int i2 = number1.intValue();
        Integer number2 = Integer.valueOf(30);
        int i3 = number2.intValue();

        int mul = i1*i2*i3;
        System.out.println(mul);

    }
}