public class PairsOfArray {
    public static void printPAirs(int arr[]){
        int pairs=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i]; 
            for(int j=i;j<arr.length;j++){  // (a,a) --> (a,b) -->j=i+1
                System.out.print("("+curr+","+arr[j]+")");
                pairs++; // count pairs
            }
            System.out.println();
        }
        System.out.println("Total Pairs made : "+pairs);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        printPAirs(numbers);
    }
}
