import java.util.*;
public class EvenOddBinary {
    public static String isOddOrEven(int num){
        int lsb=1;
        if((num & lsb)==0){
            return "Even Number";
        }
        return "Odd Number";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        System.out.println(n+" is a "+isOddOrEven(n));
        sc.close();
    }
}
