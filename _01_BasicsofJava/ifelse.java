package _01_BasicsofJava;
public class ifelse {
    public static void main(String []args){
        int score= 98;
        if(score >95 && score < 100 ){
            System.out.println("A++");
        }else if (score>80){
            System.out.println("Grade A");
        }else if(score>60){
            System.out.println("Grade B");

        }else if (score>40){
            System.out.println("Grade c");

        }else if (score <40){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade A++");
        }
        }
    }
