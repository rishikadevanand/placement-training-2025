class box<T>
{
    T value;
    void set (T value)
    {
        T get()
        {
            return value;
        }
    }
}
public class Problem_01
{
    public static void main(String[] args)
    {
      box<String> b1 = new box<>();
      b1.set("Hellowww");
      
      box<Interger> b2 = new box<>();
      b2.set(20);
    }
}