import java.util.*;
public class BinaryToDecimal {
    public static void binToDec(int binarynum){
        int mynum=binarynum;
        int pow=0;
        int decnum=0;
        while(binarynum>0){
            int lastdigit=binarynum%10;
            decnum+=(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binarynum=binarynum/10;
        }
        System.out.print("Decimal of "+mynum+" is "+decnum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the binary number : ");
        int n1=sc.nextInt();
        binToDec(n1);
        sc.close();
    }
}
