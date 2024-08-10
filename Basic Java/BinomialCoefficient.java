import java.util.*;
public class BinomialCoefficient {
    public static int factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
    public static int binomialCoefficient(int n,int r){
        int ncr=factorial(n)/(factorial(r)*factorial(n-r));
        return ncr;
    }
    // ncr= n!/r!(n-r)!
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n=sc.nextInt();
        System.out.print("enter the value of r : ");
        int r=sc.nextInt();
        int ncr=binomialCoefficient(n,r);
        System.out.print("The value of "+n+"C"+r+" : "+ncr);
        sc.close();
    }
}
