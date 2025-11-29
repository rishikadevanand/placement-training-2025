public class display
{
    public <T> void show(T value)
    {
        System.out.println(value);
    }
}
public class Problem_03
{
    public static void main(String[] args)
    {
        display d1 = new display();
        d1.show("Hello World");
        d1.show(12345);
        d1.show(45.67);
    }
}