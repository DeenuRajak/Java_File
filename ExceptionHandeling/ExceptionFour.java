package ExceptionHandeling;


class Demo
{
    public void a()  throws Exception
    {

        // try

    //    {
         b();
    //    }
    
    //    catch(Exception e)
    //    {
    //     System.out.println("error!!!" + e.getLocalizedMessage());
    //    }

    }
    public void b() throws Exception
    {
        int num1 = 8;
        int num2 = 0;

         //try
        // {
            int result = num1/num2;
            System.out.println(result);
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Error!!!" + e.getLocalizedMessage());
        // }
    }
 
}
public class ExceptionFour {
    public static void main(String [] args)
    {
        Demo obj = new Demo();
        try
        {
        obj.a();
        }
        catch(Exception e)
        {

            System.out.println("Error!!"+ e.getLocalizedMessage());
        }
    }
}
