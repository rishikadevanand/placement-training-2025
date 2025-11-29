interface Storeage<T>
{
    void add(T item);
}

class StoreString implements Storeage<String>
{
    public void add(String item)
    {
        System.out.println("String item added: " + item);
    }
}
class StoreInteger implements Storeage<Integer>
{
    public void add(Integer item)
    {
        System.out.println("Integer item added: " + item);
    }
}
public class Problem_04
{
    public static void main(String[] args)
    {
        Storeage<String> s = new StoreString();
        s.add("Generics in Java");
        Storeage<Integer> s1 = new StoreInteger();
        s1.add(100);
    }
}
