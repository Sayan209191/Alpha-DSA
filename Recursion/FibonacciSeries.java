public class FibonacciSeries {
    // print n'th fibonacci numbers
    public static int fibo(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    // print the series 
    public static void printFibonacci(int n){
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static void main(String[] args) {
        printFibonacci(7);
    }
}
