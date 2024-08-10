import java.util.*;
public class CheckPassFail {
    public static void main(String args[]){
        // marks > 33 --> pass 
        // using ternary operator -->
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks you obtain in exam : ");
        int marks=sc.nextInt();
        String remarks=(marks>33)?"Pass":"Fail";
        System.out.println("you are "+remarks+" in the Exam.");
        sc.close();
    }
}
