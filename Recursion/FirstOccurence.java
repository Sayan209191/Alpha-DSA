public class FirstOccurence {
    // to find the first Occurence of an element
    public static int firstOccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int numbers[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(numbers, 0, 5));
    }
}
