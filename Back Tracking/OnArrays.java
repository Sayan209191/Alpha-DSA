public class OnArrays {
    public static void changeArr(int arr[], int start, int val) {
        // base case
        if (start == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[start] = val;
        changeArr(arr, start + 1, val + 1);
        arr[start] = arr[start] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
