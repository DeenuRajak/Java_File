public class w {
    public static void main(String []args){
         int n=12;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==(n-1)||i+j==n  && i>(n-1)/2||i==j&&i>(n-1)/2){
                      System.out.print("*");
                }else{
                       System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
