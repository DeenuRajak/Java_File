import java.util.Scanner;
public class pattern5 {
  public static void main(String []args){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print(" Enter any number: ");
      int n= sc.nextInt();
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==0||i==(n-1)||j==(n-1)/2){
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