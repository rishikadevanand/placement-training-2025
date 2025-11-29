class pair<A,B>
{
    A first;
    B second;

    pair(A first , B second)
    {
        this.first=first;
        this.second= second;
    }

    void show()
    {
        System.out.println(first+ '-' +second);
    }
}

public class Problem_02
{
    public static void main(String[] args)
    {
        pair<Integer, String> p1 = new pair<>(1233,Rishi);
        pair<Integer, String> p1 = new pair<>(2129,Lakshu);
    }
}