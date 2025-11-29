class Holder<T>
{
    T value;

    void set(T value)
    {
        this.value = value;
    }
}
public class Problem_06
{
    public static void main(String[] args)
    {
        Holder<String> h1 = new Holder<>();
        h1.set("Generics class Example");

        Holder<Double> h2 = new Holder<>();
        h2.set(99.99);

        Holder<Integer> h3 = new Holder<>();
        h3.set(9876);

        System.out.prinln(h1.value);                
        System.out.prinln(h2.value);
        System.out.prinln(h3.value);
    }
}