import java.util.*;
public class Function {
    // function to print hello world 5 times --->
    public static void printHelloWorld(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello World");
        }
    }
    // function to calculate sum --->
    public static int calculateSum(int a,int b){  // a,b are --> parameters/formal parameters
        int sum=a+b;
        return sum;
    }
    // main function --->
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // printHelloWorld();
        System.out.println("enter the two numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=calculateSum(num1, num2); // num1,num2 are ---> arguments/ actual parameters
        System.out.println("the sum of "+num1+" and "+num2+" is "+sum);
        sc.close();
    }
    
}
