import java.util.*;
public class Strings {
    public static void printAllChar(String str) {
        // Print all Character of Strings
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Declare String Variable
        String str="Abcd";
        String str2=new String("Pqr");
        System.out.println(str);
        System.out.println(str2);

        // Input a String in a Variable
        // String name=sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length()); // Calculate the Length

        // String Concatenation --> Add multiple Strings
        String first_name="Sayan";
        String last_name="Ghorui";
        String full_name=first_name+" "+last_name;
        System.out.println(full_name);
        
        // Print the elements of Strings at any index
        System.out.println(full_name.charAt(0)); // first character 
        printAllChar(full_name);

        // Strings Comparison 

        String s1="Hello";
        String s2="HellO";
        System.out.println(s1.equals(s2));  // check two strings
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));


        sc.close();
    }
}
