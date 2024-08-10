import java.util.*;
public class Loops {
    // Loops in Java  -------->
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // While Loops -->
        int counter=0;
        while(counter<10){
            System.out.println("Hello World !!!");
            counter++;
        }
        // For loops --->
        for(int i=0;i<5;i++){
            System.out.println("Hello World !!!");
        }
        // Do-While Loops --->
        do{
            System.out.println("Hello World !!!");
            counter++; 
        }while(counter<10);

        sc.close();
    }
}
