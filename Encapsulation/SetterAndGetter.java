package Encapsulation;

class Students
{
  private int age;
  public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
private String name;

  
}
public class SetterAndGetter {
    public static void main(String [] args)
    {
        Students obj = new Students();
        Students obj1 = new Students();

        obj.setAge(19);
        obj1.setAge(19);

        obj.setName("Mussu");
        obj1.setName("Deenu");

        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();

        int stud2Age = obj1.getAge();
        String stud2Name = obj1.getName();
        
        System.out.println(stud1Name + " "+ stud1Age);
        System.out.println(stud2Name + " "+ stud2Age);
    }
}
