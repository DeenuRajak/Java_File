package _01_BasicsofJava;
//For take input from user
import java.util.Scanner;
public class userInput {
    public static void main(String []args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Age is "+ age);
            System.out.println("Enter avg");
            double avg= scan.nextDouble();
            System.out.println("Avg is " + avg);
            System.out.println(" Enter your name");
            String name = scan.next();
            System.out.println(" Your name is "+ name);
        }
        

    }
}
