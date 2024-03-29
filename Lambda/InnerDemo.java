// Inner = member , static , anonymous
package Lambda;

class AAA
{
    public void show()
    {
        System.out.println("in show");
    }
    
   class BBB
    {
        public void display()
        {
            System.out.println("In display");
        }
    }
}
public class InnerDemo {
    public static void main(String [] args)
    {
         AAA obj = new AAA();
         obj.show();
         AAA.BBB obj1 = obj.new BBB();
         obj1.display();
    }
}
