package Inheritance;

class Animals
{
    void sleep()
    {
        System.out.println("Animal need sleep");
    }
}

class Lion extends Animals
{

}
class Monkey extends Animals
{

}
class Deer extends Animals
{

}
public class Hierarchical {
    public static void main(String [] args)
    {
       Lion l = new Lion();
       Monkey m = new Monkey();
       Deer d = new Deer();

       l.sleep();
       m.sleep();
       d.sleep();
       
    }
}