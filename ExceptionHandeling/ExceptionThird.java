package ExceptionHandeling;
import java.util.*;
public class ExceptionThird {
    public static void main(String [] args)
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        
            try 
        {
          num = sc.nextInt(); 
        }
        
        catch (InputMismatchException e)
        {
            System.out.println("Enter a number");
        }

        finally
        {
            sc.close();
        }
        System.out.println(num);
    }
}

// DRY - do not repeat yourself 