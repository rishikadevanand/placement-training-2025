class PascalCase
{
    String camelCase = "exampleString";
    int CONSTANT_VALUE = 3;

    void camelCaseMethod()
    {
        System.out.println("This is a camelCase method.");
    }
}
public class Problem_10
{
    public static void main(String[] args)
    {
        PascalCase pc = new PascalCase();
        pc.camelCaseMethod();
        System.out.println("Camel Case Variable: " + pc.camelCase);
        System.out.println("Constant Value: " + pc.CONSTANT_VALUE);
    }
}
