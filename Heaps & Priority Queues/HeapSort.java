public class HeapSort {

    public static void heapify(int arr[], int i, int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Step 1: build max heap
        for (int i=n/2-1; i>=0; i--) {
            heapify(arr, i, n);
        }

        // Step 2: Largest element push at the end
        for (int i=n-1; i>0; i--) {
            // swap --> largest with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {1,4,2,5,3};
        heapSort(numbers);
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
