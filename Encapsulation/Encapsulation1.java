package Encapsulation;

class Student
{
    private int age;
    private String name;

    public void setData()
    {
        age = 19;
        name = "Deenu";
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
}
public class Encapsulation1 
{
 public static void main(String []args) 
 {
    Student obj = new Student();
    // obj.age = 19;
    // obj.name ="Deenu";
    obj.setData();
    obj.show();
 }  
}
