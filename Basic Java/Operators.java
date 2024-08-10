import java.util.*;
public class Operators {
    // Operators --->
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in); 
        System.out.print("The Two Operands : ");
        int a=scanner.nextInt();        
        int b=scanner.nextInt();  
        // Arithmatic(Binary) Operators -->['+','-','*','/','%,] 
        int result=a%b;  
        System.out.println(result);
        // Arithmatic(Unary) Operators -->['++','--']
        int c=10;
        // int d=c++;    // Post Increment
        // int d=++c;    // Pre Increment
        // int d=c--;    // Post Decrement
        int d=--c;    // Pre Decrement
        System.out.println(d);
        // Relational Operators -->['==','!=','<','>','>=','<=']
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        // Assigment Operators ---->['=','+=','-=','*=','/=']
        int p=7;    // assigns 7 into p
        System.out.println(p+=5);     // assigns 7+5=12 into p , now p=12
        System.out.println(p-=5);     // assigns 12-5=7 into p, now p=7
        System.out.println(p*=5);     // assigns 7*5=35 into p, now p=35
        System.out.println(p/=5);     // assigns 35/5=7 into p, now p=7
        // Logical Operators ---> ['&&','||','!']
        System.out.println((a>b)&&(c>=d));   // logical AND
        System.out.println((a<b)||(c<d));    // logical OR
        System.out.println(!(a<b));          // logical NOT
        scanner.close();
    }
}