import java.util.*;
public class PrintNumber1ToN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n'th number : ");
        int N=sc.nextInt();
        int counter=1;
        while(counter<=N){
            System.out.print(counter+" ");
            counter++;
        }
        sc.close();
    }
}
