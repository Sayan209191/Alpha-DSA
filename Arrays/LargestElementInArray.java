public class LargestElementInArray {
    // check largest and smallest both ---->
    public static int largestElement(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Smallest : "+min);
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,6,5,2};
        System.out.println("The Greatest Element is : "+largestElement(nums));
    }
    
}
