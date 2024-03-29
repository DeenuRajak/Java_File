// Custom Exception and throw keyword 
package ExceptionHandeling;

class InvalidNumber extends Exception
{
    public  InvalidNumber(){}
    public InvalidNumber(String msg)
    {
        super(msg);
    }
}

public class ThrowKeyword 
{
    public static void main(String [] args)
    {
        int num1 = 6;
        int num2 = -2;

    try
    {
        if(num2<0)

        {
            
            Exception e = new InvalidNumber ("Please Enter a positive number");
            throw e;
        }
        else
        {
           int result = num1 /num2;
           System.out.println(result);
        }
    }
        catch(Exception e)
        {
            System.out.println("Enter a valid number " +e );

        }
    }
}
