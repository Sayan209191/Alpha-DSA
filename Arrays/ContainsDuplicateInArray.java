public class ContainsDuplicateInArray {
    public static boolean containDuplicate(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if (key==arr[j]) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containDuplicate(numbers));
    }
}
