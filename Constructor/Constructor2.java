package Constructor;

class Demo
{
    private int a;
    private String b;

    public Demo()
    {
        System.out.println("Zero parametrized constructor by programmer ");
    }

    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
   
}
public class Constructor2 {
    public static void main(String []args)
    {
        Demo d =new Demo();
       d.disp();
       Demo d2 = new Demo(8,"Deenu");
       d2.disp();
    }
}
