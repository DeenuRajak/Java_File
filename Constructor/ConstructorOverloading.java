package Constructor;

class Student1
{
    private String name;
    private int age;

    public Student1()
    {
        System.out.println("Default Constructor is called ");
        name = "Deenu";
        age = 19;
    }

    public Student1(String name)
    
    {
       this.name = name;
       age = 19;

    }

    public Student1(String name, int age)
    {
        this.age = age;
        this.name = name;

    }

    void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class ConstructorOverloading {
    public static void main(String []args)
    {
        Student1 st = new Student1();
        st.disp();

        Student1 st1 = new Student1("Mussu");
        st1.disp();

        Student1 st2 = new Student1("Atul",19);
        st2.disp();



    }
}
