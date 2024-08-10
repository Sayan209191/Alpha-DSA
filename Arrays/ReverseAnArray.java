public class ReverseAnArray {
    public static void reverse(int arr[]){
        int first=0,end=arr.length-1;
        while(first<end){
            int temp=arr[first];
            arr[first]=arr[end];
            arr[end]=temp;
            first=first+1;
            end=end-1;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        reverse(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}