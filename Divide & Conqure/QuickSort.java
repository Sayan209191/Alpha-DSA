public class QuickSort {
    public static int partition(int arr[],int start,int end){
        int i=start-1;   // to make place
        int pivot=arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
    public static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int pivotidx=partition(arr, start, end);
        quickSort(arr, start, pivotidx-1);   // left
        quickSort(arr, pivotidx+1, end);    // right
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={6,3,9,8,2,5};
        quickSort(numbers,0,numbers.length-1);
        printArr(numbers);
    }
}
