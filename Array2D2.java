public class Array2D2 {
    public static void main(String []args){
    //    int nums[][]=new int [3][2];
    //    nums[0][0]=1;
    //    nums[0][1]=2;
    //    nums[1][0]=3;
    //    nums[1][1]=4;
    //    nums[2][0]=5;
    //    nums[2][1]=6;

    int nums[][]={
        {2,3,4,5},
        {1,3},
        {0,1,8,45}
    };
        for(int i=0;i<=2;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
