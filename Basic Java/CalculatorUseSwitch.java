import java.util.*;
public class CalculatorUseSwitch {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the two number : ");
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        System.out.print("Press the Switch to perform : ");
        char operator=scanner.next().charAt(0);
        switch(operator){
            case '+':
                    System.out.println(a+b);
                    break;
            case '-':
                    System.out.println(a-b);
                    break;
            case '*':
                    System.out.println(a*b);
                    break;
            case '/':
                    System.out.println(a/b);
                    break;
            default:
                    System.out.println("Wrong Operator.");
        }
        scanner.close();
    }
}
