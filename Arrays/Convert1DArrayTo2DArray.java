public class Convert1DArrayTo2DArray {
    public static int[][] convert(int[] arr, int n, int m) {
        int ans[][] = new int[n][m];
        for(int i = 0;i<n;i++) {
            for (int j=0;j<m;j++) {
                ans[i][j] = arr[(i*m)+j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n=2;
        int m=2;
        int sorted2DArr[][] = convert(arr, n, m);
        for(int i=0; i<sorted2DArr.length ; i++) {
            for(int j=0; j<sorted2DArr[0].length; j++){
                System.out.print(sorted2DArr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
