public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){  // no of turns = n-2
            for(int j=0;j<n-1-i;j++){     // turns goes to --> n-2-turn
                if(arr[j]>arr[j+1]){
                    // swap the numbers 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {  // to print the array 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        bubbleSort(numbers);
        printArr(numbers);
    }
}
