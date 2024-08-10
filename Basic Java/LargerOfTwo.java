import java.util.*;
public class LargerOfTwo {
    // print the largest of two number--->
    public static void main(String argss[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("The Two number whice are compared : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("Two Numbers are Equal.");
        }
        else if(num1>num2){
            System.out.println("The larger number is : "+num1+".");
        }
        else{
            System.out.println("The larger number is : "+num2+".");
        }
        sc.close();
    }
}