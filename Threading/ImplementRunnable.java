package Threading;

class Demo121 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Executing ");
        try{
            Thread.sleep(3000);
        }
        catch(Exception e)
        {
            System.out.println("Some Problem");
        }

        System.out.println("Child thread task completed");
    }
}


public class ImplementRunnable {
    public static void main(String [] args)
    {
      System.out.println("Main Thread started");

      Demo121 d = new Demo121();

      Thread t1 = new Thread(d);

      t1.start();
    }
}
