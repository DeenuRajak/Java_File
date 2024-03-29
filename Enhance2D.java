public class Enhance2D {
    public static void main(String []args){
        int nums [][]={
            {2,3,4,1},
            {1,1,1,1},
            {2,3,0,1}
        };

        for(int a[]:nums){
           for(int b:a){
            System.out.print(b+" ");
           }
           System.out.println();
        }
    }
}
