package Strings;
import java.util.*;
public class Reverse {
    public static void main(String []args){
        System.out.println("Enter any word or sentences");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String str1 = "";


            for (int i = str.length()-1; i>=0; i--){
                 str1 = str1 + str.charAt(i);
            }
            System.out.println( "Before reversing : " + str);
            System.out.print( "After reversing : " + str1);
        }
       
    }
}
