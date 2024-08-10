public class LargestElementInTwoDArray {
    // to find largest element 
    public static int largestElement(int arr[][]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest) largest=arr[i][j];
            }
        }
        return largest;
    }
    // to find smallest element
    public static void minElement(int arr[][]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<smallest) smallest=arr[i][j];
            }
        }
        System.out.println("Smallest Element in the matrix :"+smallest);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println("Largest Element in the matrix : "+largestElement(matrix));
        minElement(matrix);
    }
}
