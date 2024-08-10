public class PosibiltyOfRotation {
     public static int minSearch(int arr[]) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[l]<=arr[mid] && arr[mid]>arr[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
    public static int binarySearch(int arr[],int start,int end,int key) {
        int l=start;
        int r=end;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int search(int arr[],int key) {
        int minval=minSearch(arr);
        // find in sortetd left
        if(arr[minval]<=key && key<=arr[arr.length-1]){
            return binarySearch(arr,minval,arr.length-1,key);
        }
        //find in sorted right
        else{
            return binarySearch(arr,0,minval,key);
        }
    }
    public static void main(String[] args) {
        int numbers[]={4,5,6,7,8,0,1,2,3};
        int target=0;
        System.out.println(search(numbers,target));
    }
}
