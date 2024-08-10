public class CheckArraySorted {
    // Given an Array is Sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,9,8};
        System.out.println(isSorted(numbers,0));
    }
}
