package Strings;
import java.util.*;
public class Reverse1 {
    
public static void main(String []args ){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter any Sentence :");
        String str = sc.nextLine();

        String Sarr[] = str.split(" ");
        String str1 = " ";


        for(int i = Sarr.length-1 ; i >= 0; i--){
            str1 = str1 + Sarr[i]+" ";
            
        }
        System.out.println("Before reversing :"+str);
        System.out.print(" After reversing :"+str1);
    }

}

}