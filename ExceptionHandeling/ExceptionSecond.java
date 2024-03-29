package ExceptionHandeling;

public class ExceptionSecond {
    public static void main(String []args)
    {
        int num1 = 8;
        int num2 = 4;
        int result = 0;
        int values []= {4,7,2,9};
        try
        {
            result = num1/num2;
            System.out.println(values[2]);
        }

        catch(ArithmeticException ae)
        {
            System.out.println("cannot divide by zero "+ ae);
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println(values[values.length-1]);
            System.out.println("Stay in your limits");
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}
