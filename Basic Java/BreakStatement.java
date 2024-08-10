import java.util.*;
public class BreakStatement {
    // keep enntering number till user enters a multiple of 10
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Please enter a number : ");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            else{
                System.out.println(num);
            }
            
        }while(true);
        sc.close();
    }
}
