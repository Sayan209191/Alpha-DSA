import java.util.*;
public class AllPrimeInRangeN {
    public static int checkPrime(int num){
        int flag=1;
        if(num==1){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=0;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the upper bound no : ");
        int n2=sc.nextInt();
        System.out.println("enter the lower bound no : ");
        int n1=sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(checkPrime(i)==1){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
