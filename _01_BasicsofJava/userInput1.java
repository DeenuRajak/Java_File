package _01_BasicsofJava;
import java.util.Scanner;
public class userInput1 {
    public static void main(String []args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your name :");
            String name1= scan.next();
            System.out.println("Enter your crush name");
            String name2=scan.next();
            System.out.println(name2 +" will love you soon be patience " + name1);
        }
    }
}
