public class MissingNumber {
    // find out the missing number in the array
    public static int missingNumber(int arr[]) {
        int n=arr.length;
        int sum=((n+1)*(n+2))/2;
        int count=0;
        for(int i=0;i<n;i++){
            count+=arr[i];
        }
        return sum-count;
    }
    
    public static void main(String[] args) {
        int numbers[]={6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(numbers));
    }
}