enum direction
{
    NORTH , SOUTH, EAST, WEST
}

public class Problem_03
{
    public static void main(String[] args) 
    {
        direction d = direction.WEST;

        switch(d)
        {
            case NORTH: System.err.println("Going north"); break;
            case SOUTH: System.err.println("Going south"); break;
            case EAST: System.err.println("Going east"); break;
            case WEST: System.err.println("Going west"); break;
        }
    }
}