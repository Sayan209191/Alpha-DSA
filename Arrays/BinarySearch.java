public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int size=arr.length;
        int start=0,end=size-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key=6;
        System.out.println("key Present in : "+binarySearch(numbers, key));
    }
}