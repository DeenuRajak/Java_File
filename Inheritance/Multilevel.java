package Inheritance;

class Demo1
{
    void disp()
    {
        System.out.println("Disp written in Demo1 class");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
public class Multilevel {
    public static void main(String []args )
    {
        Demo3 d = new Demo3();
        Demo2 d1 = new Demo2();

        d.disp();
        d1.disp();
    }
}
