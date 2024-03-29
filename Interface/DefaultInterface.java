package Interface;

interface AA
{
    void show();
    default void config()
    {
        System.out.println("In Config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }

}

class BB implements AA
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class DefaultInterface {
    public static void main(String [] args)
    {
        AA.abc();
        AA obj = new BB();
        obj.show();
        obj.config();
       
    }
}
