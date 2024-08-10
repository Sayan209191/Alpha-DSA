import java.util.*;
public class LargestOfThree {
    // Find the largest of three number --->
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three numbers : ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        if(a>b && a>c){
            System.out.println("The Largest nu,mber is : "+a+" .");
        }
        else if(b>c && b>c){
            System.out.println("The Largest nu,mber is : "+b+" .");
        }
        else{
            System.out.println("The Largest nu,mber is : "+c+" .");
        }
        sc.close();
    }
    
}
