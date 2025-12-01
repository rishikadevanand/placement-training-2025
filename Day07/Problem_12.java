class TestBuffer extends Threads
{
    satic StringBuilder sb = new StringBuilder ("Helloww");

    public void run()
    {
        for(int i = 0 ; i<5 ;i++)
            {
                sb.append("X")
            }        
    }

    public static void main(String[] args) throws Exception
    {
      TestBuffer t1 = new TestBuffer();
      TestBuffer t2 = new TestBuffer();

     t1.start();
     t2.start();

     t1.join();
     t2.join();

     System.out.println(sb);

    }
}