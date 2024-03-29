package Inheritance;

class Human
{
    int age = 18;
    void sleep()
   {
     System.out.println("Human needs good sleep ");
     System.out.println(age);
   }
}

class Student extends Human
{

}
public class Inheritance1 {
    public static void main(String []args)
    {
         
        Student st = new Student();
        st.sleep();
    }
}
