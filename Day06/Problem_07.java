class genericmethods
{
    public void<T> prinrtdata(T data)
    {
        System.out.println(data);
    }
}
public class Problem_07
{
    puvlic static void main(String[] args)
    {
        genericmethods gm = new genericmethods();
        gm.printdata("Generics Method");
        gm.printdata(12345);
        gm.printdata(67.89); 
    }
}