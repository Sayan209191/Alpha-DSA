import java.util.*;
public class CheckEven {
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.print(isEven(num));
        sc.close();
    }
}
