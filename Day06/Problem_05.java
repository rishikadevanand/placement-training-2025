class Util
{
    public staic <T> getFirst (T[] array)
    {
        return array[0];
    }
}
public class Problem_05
{
    public static void main(String[] args)
    {
        Integer[] arr1 = {10,20,30,40,50};
        String[] arr2 = {"Apple", "Banana", "Cherry"};

        System.out.println(Util.getFirst(arr1));
        System.out.println(Util.getFirst(arr2));
    }
}