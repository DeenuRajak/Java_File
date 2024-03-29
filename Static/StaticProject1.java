package Static;

class Demo
{
    static int a;
    static int b;
     
    int m;
    int n;

    static
    {
        a= 10;
        b=20;
        System.out.println("Control in Static Block");
    }
    {
        m= 100;
        n=200;
        System.out.println("Control in Instance Block");
    }

    static void disp1()
    {
        System.out.println("Value of Static var "+a);
        System.out.println("Value of static var "+b);

    }

    void disp2()
    {
       System.out.println("Value of instance var "+ m);
       System.out.println("Value of instance var "+n);
    }
}
public class StaticProject1
    

{
    public static void main(String []args)
    {
        Demo.disp1();
        Demo d = new Demo();
        d.disp2();
    }
    
}
