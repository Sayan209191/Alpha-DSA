import java.util.*;
public class ProductOfTwo{
    // Product of two integers -------->
    public static int productOfTwo(int num1,int num2){
        return num1*num2;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("The two numbers are : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product=productOfTwo(a, b);
        System.out.print("The product is : "+product);
        scanner.close();
    }
    
}
