import java.util.*;
public class SumOfDigitOfAnInteger{
    public static int sumOFDigit(int num){
        int sum=0;
        if(num==0){
            return 0;
        }
        while(num>0){    
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumOFDigit(124));
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int num=sc.nextInt();
        System.out.println(sumOFDigit(num));
        sc.close();
    }
}
