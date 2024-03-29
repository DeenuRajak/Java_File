package DependencyInjection;


class Student
{
    private Heart h;

    public Student(Heart h)
    {
        this.h= h;

    }

    public void setH(Heart h)
    {
        this.h = h;
    }

    public void call()
    {
        h.heartBeat();
    }


}

class Heart 
{
    public void heartBeat()
    {
        System.out.println("Heart is important ");
    }
}
public class HasA 
{
    public static void main(String [] args)
    {
        Heart h = new Heart();

        Student s = new Student(h);
        s.setH(h);  //Setter injection
    }
}