package Threading;

import java.util.*;
class Calc implements Runnable 
{
    public void run()
    {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter first number");

        int num1 = sc.nextInt();
        
        System.out.println("Please Enter 2nd number");

        int num2 = sc.nextInt();

        int result = num1+ num2;

        System.out.println(result);
        System.out.println("Calculation Task Ended");

        System.out.println("***************************************");
        sc.close();


    }
}

class message implements Runnable
{
    public void run()
    {
        System.out.println("Displaying important message task ");
       try {
        for(int i= 0;i<3;i++)
        {
            System.out.println("Focus is important to master skills ");
            Thread.sleep(5000);
        }
        }
        catch(Exception e)
        {
            System.out.println("Some Problem");
        }
        System.out.println("Displaying import message task ended");
    }
}
public class ThreadCreation {
    public static void main(String [] args)
    {
        System.out.println("Main Thread started ");
        Calc c1 = new Calc();
        message m2 = new message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    
    }
}
