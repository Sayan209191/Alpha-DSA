public class PrintNTo1Decresing {
    // print n to 1 (decreasing order)
    public static void printNumDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printNumDec(n-1);
    }
    public static void main(String[] args) {
        int num=10;
        printNumDec(num); 
    }
}
