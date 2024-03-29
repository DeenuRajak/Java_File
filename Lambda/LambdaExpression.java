package Lambda;

interface taxi
{
    void drive32(int avg, int ts);
   
}
public class LambdaExpression {
    public static void main(String [] args)
    {
          taxi tx = (avg,ts) -> 
            System.out.println("Driving....."+ avg);
          tx.drive32(45,140);

          System.out.println("Hii, My taxi speed is now 40000km/h");
          
          System.out.println("Don't worry everything is fine");
        
        
    }
}
