package Threading;

public class ChangeThread {
    public static void  main (String [] args)
    {
        System.out.println("Main Thread");
        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("Name of Thread is "+name);

        // System.out.println(Thread.currentThread().getPriority());
        System.out.println("The priority of main Thread is "+Thread.currentThread().getPriority());

        System.out.println("After Changing");

        Thread t= Thread.currentThread();
        t.setName("Don");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println("The name of main Thread is "+ name1);
        System.out.println("The priority of main Thread is "+ Thread.currentThread().getPriority());
    }
}
