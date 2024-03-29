package Encapsulation;

class StudentBoy
{
    private int age;
    private String name;

    public void Data(int age)
    {
       this.age = age;
    }

    public void Data1(String name)
    {
        this.name = name;
    }

    public void Disp()
    {
        System.out.println(name + " "+ age);
    }
}
public class EncapsulationWithThis
{
   public static void main(String []args)
   {
    StudentBoy obj = new StudentBoy();
    StudentBoy obj1 = new StudentBoy();

    obj.Data(19);
    obj1.Data(18);

    obj.Data1("Deenu");
    obj1.Data1("Mussu");

    obj.Disp();
    obj1.Disp();
   }
}