public class Print1ToN {
    // print 1 to n (increasing order)
    public static void printNumInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNumInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int num=10;
        printNumInc(num);
    }
}
