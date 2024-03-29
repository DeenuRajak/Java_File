package Strings;

public class Launce1 {
    public static void main(String []args){
        String s1= new String("pw skill");
        s1 = s1.concat("Bangaluru");
        System.out.println(s1);

        String s2 = "pw skill";
        String s3 = s2.concat("java");
        String s4 = new String ("Pw java");
        s4 = s4.concat("Bangaluru");
        
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        // concat with '+' operator
        String s5 = "pw";
        String s6 = "pw "+ "java";
        String s7 = "pw "+"java "+"Bengaluru";
        String s8 = s5 + s6;
        String s9 = "pw pw java";

        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9==s8);

        // concat number with string

        String str = "pw "+ 100 + 99;
        System.out.println(str);
        String str1 = 100 + 99+ " love";
        System.out.println(str1);
        }

        
}
