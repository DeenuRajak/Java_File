package Inheritance;

class Human1
{   
    // private String name;
    int age;
    Human1()
    {
        System.out.println("Human class constructor ");
    }
    void sleep ()
    {   

        age = 18;
        System.out.println("Human needs good sleep ");
        System.out.println(age);
    }
}

class Student1 extends Human1
{   
    // public Student1()
    // {
    //     super();   already automatic construct when obeject is invoked
    // }
    void disp()
    {
        System.out.println("The age "+ age);
        // System.out.println("The name is "+ name);  private member can't be inherited 
    }
}
public class Inheritance2 {
    public static void main(String []args)
    {
        Student1 st1 = new Student1();
        st1.sleep();
        st1.disp();
    }
}
