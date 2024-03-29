// practice for palindrome  (traverse on any word towards weither it is left or right it will always produce a same output)

package Strings;

public class Palindrome {
    public static void main (String []args){
        String str = "MADAM";
        String str1 = "";
        for(int i = str.length()-1; i>=0; i--){
            str1 = str1 + str.charAt(i);
        }

        System.out.println(str1);

        if(str.equals(str1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("NOT PALINDROME");
        }
    }
}
