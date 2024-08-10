public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            // to find the correct position
            while(prev>=0 && arr[prev]>cur){   
                arr[prev+1]=arr[prev];
                prev--;
            }
            // to push the element
            arr[prev+1]=cur;
        }
    }
    // print the array
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        insertionSort(numbers);
        printArray(numbers);
    }
}
