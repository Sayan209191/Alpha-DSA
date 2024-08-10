import java.util.*;
public class PrimeNumber {
    // Make the function --->
    public static void checkPrimeNumber(int num){
        if(num>0){
            if(num<=2){
                System.out.println(num+" is not a Prime Number .");
            }
            else{
                boolean flag=true;
                for(int i=2;i<=Math.sqrt(num);i++){
                    if(num%i==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println(num+" is a Prime Number .");
                }
                else{
                    System.out.println(num+" is not a Prime Number .");
                }
            }
        }
        else{
            System.out.println("The number is a Negative Number.");
        }
    }
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
    // Check a number is prime or not --->
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check :");
        int num=sc.nextInt();
        System.out.print(checkPrime(num));
        sc.close();
    }
}
