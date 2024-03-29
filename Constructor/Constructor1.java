package Constructor;


class Student
{
    private int age;
    private String name;

    Student (String name, int age)
    {
        this.age = age;
        this.name= name;

    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
public class Constructor1 {
    public static void main(String []args)
    {
        Student st = new Student("Deenu", 19);
        String name = st.getName();
        int age = st.getAge();

        System.out.println(name + " "+ age);
        System.out.println(st);

    }
}
