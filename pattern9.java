import java.util.Scanner;
public class pattern9 {
    public static void main(String []args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number :");
            int n= scan.nextInt();
             for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0||j==(n-1)/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
              }
        }
         }
           
           
}