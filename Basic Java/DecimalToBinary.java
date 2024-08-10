import java.util.*;
public class DecimalToBinary {
    public static void decToBin(int num){
        int mynum=num;
        int pow=0;
        int binnum=0;
        while(num>0){
            int rem=num%2;
            binnum+=rem*Math.pow(10, pow);
            pow++;
            num/=2;
        }
        System.out.print("Binary of "+mynum+" is : "+binnum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Decimal number : ");
        int n=sc.nextInt();
        decToBin(n);
        sc.close();
    }
}

