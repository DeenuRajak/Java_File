package Strings;
import java.util.*;
public class Reverse2 {
    public static void main(String []args){
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any sentence :");
             String str= sc.nextLine();
             
             String str1= " ";
             String arr[] = str.split(" ");

             for(String elem : arr){
                for(int i = elem.length()-1 ; i>=0; i--){

                    str1= str1 + elem.charAt(i);
                }
               str1= str1+" ";
             }
             System.out.println("Before reversing :"+ str);
             System.out.print("After reversing :"+ str1);
        }

    }
}
