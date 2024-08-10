import java.util.*;
public class SumOfNaturalNumber {
    public static void main(String args[]){
        int sum=0;
        // Sum of first five natural number -->
        // for(int i=1;i<=5;i++){
        //     sum+=i;
        // }
        // sum of first n natural number -->
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N'th natural number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }    
        System.out.println("The Sum is : "+sum);
        sc.close();
    }
}
