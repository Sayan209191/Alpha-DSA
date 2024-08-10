import java.util.*;             // import a package
public class InputTake{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); // make a Object to take input
        String Name=scanner.nextLine();
        System.out.println(Name);
        boolean ans=scanner.nextBoolean();
        System.out.println(ans);
        long p=scanner.nextLong();
        System.out.println(p);
        int a=scanner.nextInt();
        System.out.println(a);
        float q=scanner.nextFloat();
        System.out.println(q);
        scanner.close();
    }
}
