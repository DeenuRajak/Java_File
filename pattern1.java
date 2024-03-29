//First pattern question for star printing in squre shape
import java.util.Scanner;
public class pattern1 {
    public static void main(String []args )
    {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter any number");

            int n = scan.nextInt();
    for (int j=0;j<n;j++) 
     {
             for(int i=0; i<n;i++)
            {
                System.out.print("* ");
            }
            System.out.println("*");
     }
        }
   }
}