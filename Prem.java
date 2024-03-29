import java.util.Scanner;
public class Prem {
    public static void main(String [] args){
     try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Enter your Lucky number between 11 and 25 :");
         int n= scan.nextInt();
         for(int i =0;i<n;i++){
               for(int j=0;j<n;j++){
                if(j==0||j==(n-1)||i==j&& i<=(n-1)/2||i+j==n && i<=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
                System.out.print(" ");
               for(int j=0;j<n;j++){
                if(i==(n-1)&&j!=0&&j!=(n-1)||j==0&&i!=(n-1)||j==(n-1)&&i!=(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
               
               System.out.print(" ");
               for(int j= 0;j<n;j++){
                if(i ==0 && j!=0 ||j==0&&i!=0 && i<(n-1)/2||i==(n-1)/2&&j!=0&&j!=(n-1)||j==(n-1)&& i>(n-1)/2 &&i<(n-1)||i==(n-1)&&j!=(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
             
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(j==0||i+j==(n-1)/2||i-j==(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(i==0&&j!=0&&j!=(n-1)||i==(n-1)/2||j==0 && i>0||j==(n-1)&& i>0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
              
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(j==0||j==(n-1)||i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
               System.out.println();    
         }
         System.out.println();
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

        System.out.println();
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i==(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(i==0&&j!=0&&j!=(n-1)||j==0&&i!=0&&i!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(i-j==(n-1)/2||i+j==(n-1)+(n-1)/2||j==0&&i<(n-1)/2||j==(n-1)&&i<(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(i==0||i==(n-1)/2&&j<=(n-1)/2||i==(n-1)||j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
}
System.out.println();
for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
           if(j==(n-1)/2&& i>(n-1)/2||i+j==n&&i<=(n-1)/2||i==j&&i<=(n-1)/2&&i!=0){
               System.out.print("*");
           }else{
               System.out.print(" ");
           }
   }
   System.out.print(" ");
   for(int j=0;j<n;j++){
        if(i==0&&j!=0&&j!=(n-1)||j==0&&i!=0&&i!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1)||i==(n-1)&&j!=0&&j!=(n-1)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
}
System.out.print(" ");
for(int j=0;j<n;j++){
        if(i==(n-1)&&j!=0&&j!=(n-1)||j==0&&i!=(n-1)||j==(n-1)&&i!=(n-1)){
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