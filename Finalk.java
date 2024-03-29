// class Animal3
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping ");
//     }
// }

class Animal3
{   
    final int age = 19;
    final void sleep()
    {   
        // age = 20;
        System.out.println("Animal is sleeping ");
    }
}

class Tiger3 extends Animal3
{
    //  void sleep()    final method we cannot override in child class 
    // {   
        
    // }
}
public class Finalk {
    public static void main (String [] args)
    {
        Tiger3 t = new Tiger3();
        t.sleep();
    }
}
