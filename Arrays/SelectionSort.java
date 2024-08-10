public class SelectionSort {
    // main algorithm
    public static void selectionSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){ // no of turn
            int minimum=i;   // assume minimum value in i'th position
            for(int j=i+1;j<n;j++){     // unsorted array starts
                if(arr[j]<arr[minimum]){   // check for smallest value
                    minimum=j;     // update mimimum's position
                }
            }
            // swap
            int temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
    }
    // to print the array
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // main function 
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        selectionSort(numbers);
        printArray(numbers);
    }
}
