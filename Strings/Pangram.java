package Strings;

public class Pangram {
     public static void main(String []args){
       Boolean flag = false;
        String str ="THE QUICK JUMPS BROWN FO OVER THE LAZY DOG";
        str = str.replace(" ","");

        char ch[] = str.toCharArray();
        int ar[]= new int[26];

        for(int i =0 ; i<ch.length; i++){
            ar[ch[i]-65]++;
        }
        for(int i= 0;i<ar.length;i++){
            if (ar[i]==0){
                System.out.println("It's not a Pangram");
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("It's a pangram");
        }
        
     }
    }