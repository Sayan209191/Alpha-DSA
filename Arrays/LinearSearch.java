public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14};
        int key=11;
        int result=linearSearch(nums, key);
        if(result==-1){
            System.out.println("Not Found .....");
        }
        else{
            System.out.println("Found in "+result+" indexes....");
        }
    }
}
