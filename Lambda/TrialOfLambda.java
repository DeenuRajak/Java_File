package Lambda;


interface Calc
{
    void disp();
}
public class TrialOfLambda
 {
    public static void main (String [] args)
    {
    // {
        Calc c = new Calc() {
            public void disp()
            {
                System.out.println("Hello disp method");
            }

            
        };
        c.disp();

    // Calc cal = ()->
    // {
    //     System.out.println("Hello");
    // };

    // cal.disp();
}
}
