public class Problem_06
{
    public static void main(String[] args)
    {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;
        Integer num1 = n1;
        Integer num2 = n2;
        Integer num3 = n3;
        Integer num4 = n4;
        Integer num5 = n5;


        Integer number = Integer.valueOf(num1);
        int i1 = number.intValue();
        Integer number1 = Integer.valueOf(num2);
        int i2 = number1.intValue();
        Integer number2 = Integer.valueOf(num3);
        int i3 = number2.intValue();
        Integer number3 = Integer.valueOf(num4);
        int i4 = number3.intValue();
        Integer number4 = Integer.valueOf(num5);
        int i5 = number4.intValue();

        int sum = i1+i2+i3+i4+i5;
        System.out.println(sum);

        
    }
}