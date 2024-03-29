 package Strings;

public class Launce
{
    public static void main(String []args){
       String s1 = "pw skill";
        String s2 = "pw skill";
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
       
        String s3 = "pw skill";
        String s4 = "pw skill";
        String s5 = "pw SKILL";
        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s5));//true

        String s6 = "pw skill";
        String s7 = new String("pw skill");
        String s8 = new String("pe skill");

        System.out.println(s6==s7);//false
        System.out.println(s6==s8);//false
        System.out.println(s7==s8);//false


        
    }
}
