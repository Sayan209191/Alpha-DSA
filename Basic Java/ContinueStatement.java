import java.util.*;
public class ContinueStatement {
    // Display all numbers entered by the user except multiplies of 10
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int counter=0;
        do{
            System.out.print("Please enter a number : ");
            int n=sc.nextInt();
            counter++;
            if(n%10==0){
                continue;
            }
            System.out.println(n+" ");
        }while(counter<5);
        sc.close();
    }
}
