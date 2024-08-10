public class LastOccurance {
    // to find the Last Occurence of an element in a Array
    public static int getLastOccurence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        // look forwards
        int isFound=getLastOccurence(arr, i+1, key);
        // check with self
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        else{
            return isFound;
        }
    }
    public static void main(String[] args) {
        int numbers[]={8,3,6,9,5,10,2,5,3};
        System.out.println(getLastOccurence(numbers,0,5));
    }
}    
