package Encapsulation;

class Student1
{
    private int age;
    private String name;

    public void setData1(int a,String b)
    {
        age = a;
       name =b;

    } 
    public void show1()
    {
        System.out.println(name + " "+ age);
    }
}

public class Encapsulation2
{
    public static void main(String []args)
    {
        Student1 obj1 = new Student1();
        obj1.setData1(4,"Raj");
        obj1.show1();
    }
}