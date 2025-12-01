
enum season
{
    summer , winter , spring , autumn
}

public class Problem_05
{
    public static void main(String[] args)
    {
        for (season s: season.values())
        {
            System.out.println(s);
        }
    }
}