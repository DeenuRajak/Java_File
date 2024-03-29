public class conditional1 {
    public static void main(String []args){
        int age =70;
                if(age>=18 && age<=60){
            if(age>20 && age<30){
                System.out.println("You're in 20's");
            }else if (age>=30 && age <=40){
                System.out.println("You're in 30's");

            }else {
                System.out.println("You're still an old man");
            }
        }else if(age>60){
            System.out.println("You're an old man now");
        }else if (age>=16 && age<18){
            System.out.println("You're teen ager");
        }else {
            System.out.println("You're still a child or kid");
        }
    }
}
