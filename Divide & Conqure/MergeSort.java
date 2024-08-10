public class MergeSort {
    public static void merge(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        // merge left and right
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // Remaining left part element
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // Remaining right part element
        while(j<=end){
            temp[k++]=arr[j++];
        }
        // copy temporary array to main array
        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr, start, mid);  // for left sub part
        mergeSort(arr, mid+1, end);  // for right sub part
        merge(arr, start, mid, end);
    } 
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={6,3,9,5,2,8};
        mergeSort(numbers,0,numbers.length-1);
        printArr(numbers);
    }
}
