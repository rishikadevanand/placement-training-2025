enum status
{
    success(200);
    error(500);
    notfound(404);

    private int code;

    status( int code)
    {
        this.code = code;
    }

    public int getcode ()
        {
            return code;
        }
}

public class Problem_04
{
    public static void main(String[] args) 
    {
        status s= status.success;
        System.err.println(s.getcode());
    }
}