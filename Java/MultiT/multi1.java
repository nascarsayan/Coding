public class multi1
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread : " + t);
        t.setName("My thread");
        System.out.println("Ater name change : " + t);
        try
        {
            for(int n = 5; n > 0; n--)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
    }
}