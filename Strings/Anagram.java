package Strings;
import java.util.*;
public class Anagram {
    public static void main(String []args){
        String str = "School Master";
         String str1 = "The classroom";

         str =str.replace(" ", "");
         str1 = str1.replace(" ","");

         str = str.toLowerCase();
         str1 = str1.toLowerCase();

         char arr[] =str.toCharArray();
         char arr1[]= str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if (Arrays.equals(arr,arr1)){
            System.out.println("It's an Anagram ");
        }else{
            System.out.println("It's Not an Anagram");
        }

    }
}
