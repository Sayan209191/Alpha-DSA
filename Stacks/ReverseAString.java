import java.util.Stack;
public class ReverseAString {
    // Reverse a String using stack
    // Amazon , Adobe , Microsoft , Paytm , Flipkart

    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb=new StringBuilder("");
        while(! s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str="abcd";
        System.out.println(reverseString(str));
    }
}
