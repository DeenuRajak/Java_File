import java.util.Scanner;
public class pattern2 {
    public static void main(String []args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number :");
            int n= scan.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                  if(i==0||i==(n-1)||j==0||j==(n-1))
                    {
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
