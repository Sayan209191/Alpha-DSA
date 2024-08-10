import java.util.*;
public class ConditionalStatement {
    //  [if-else , else-if , ternary operator , switch]
    public static void main(String args[]){
        // // [if -else if - else]  --->
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("you are Adult : you are eligible for Vote,Drive");
        }
        else if(age>13 && age<18){
            System.out.println("You are Teenager.");
        }
        else{
            System.out.println("You are a Child.");
        }
        // Ternary operator --->

        System.out.print("enter the number : ");
        int num=scanner.nextInt();
        String type=((num%2)==0)? "Even":"Odd";
        System.out.println(type);
        
        // switch Statement -->

        System.out.print("enter the number : ");
        int number=scanner.nextInt();
        switch(number){
            case 1:
                    System.out.println("Ice Cream.");
                    break;
            case 2:
                    System.out.println("Momo");
                    break;
            case 3:
                    System.out.println("Pizza");
                    break;
            default:
                    System.out.println("You wake up .");
        }
        scanner.close();
    }
}