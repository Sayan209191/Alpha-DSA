public class DiagonalSum {
    public static int diagonalSum(int arr[][]){
        int n=arr.length-1;
        // int pd_sum=0;
        // int sd_sum=0;
        int sum=0;
        for(int i=0;i<=n;i++){
            // pd_sum+=arr[i][i];  // primary diagonal sum
            sum+= arr[i][i];  // primary diagonal sum
            if(i!=n-i){
                // sd_sum+=arr[i][n-i];  // secondary diagonal sum
                sum+=arr[i][n-i];  // secondary diagonal sum
            }
        }
        // int result=pd_sum+sd_sum;  // total sum
        // return result;
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(diagonalSum(matrix));
    }
}
