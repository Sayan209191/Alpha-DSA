import java.util.*;
public class FactorialOfANumber {
    // By function --->
    public static int factorial(int num){
        int fac=1;
        for(int i=1;i<=num;i++){
            fac*=i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int factorial=factorial(num);   // call the function -->
        System.out.println("The Fcatorial of "+num+" : "+factorial);
        sc.close();
    }
}
