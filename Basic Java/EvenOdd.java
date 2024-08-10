import java.util.*;
public class EvenOdd {
    // check a number is even or odd --->
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The Number is ODD.");
        }
        sc.close();
    }
}
