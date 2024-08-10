import java.util.*;
public class EvenOddClassify {
    //a program that reads a set of integers,
    // and then prints the sum of the even and odd integers
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum_of_even=0;
        int sum_of_odd=0;
        int choice;
        do{
            System.out.print("enter the integer : ");
            int num=sc.nextInt();
            if(num%2==0){
                sum_of_even+=num;
            }
            else{
                sum_of_odd+=num;
            }
            System.out.print("Do you want to continue ?\nPress 1 for yes or 0 for no");
            choice = sc.nextInt();

        }while(choice==1);
        System.out.println("The sum of the even numbers is : "+sum_of_even+" .");
        System.out.println("The sum of the odd numbers is : "+sum_of_odd+" .");
        sc.close();
    }
}
