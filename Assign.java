import java.util.*;
public class Assign {
    public static void main(String []args){
        try (Scanner scc = new Scanner(System.in)) {
            System.out.print("Enter any number :");
            int n= scc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==(n-1)||j==(n-1)||i+j<=(n-1)/2||j-i>=(n-1)/2)
                    {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==(n-1)||j==(n-1)||i+j<=(n-1)/2||j-i>=(n-1)/2)
                    {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
