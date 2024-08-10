public class SumOfSecondRowInAMatrix {
    // sum of 2nd row in a matrix
    public static int sumOfSecondRow(int arr[][]){
        int sum=0;
        for(int col=0;col<arr[0].length;col++){
            sum+=arr[1][col];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Sum of 2nd Row : "+ sumOfSecondRow(arr));
    }
}
