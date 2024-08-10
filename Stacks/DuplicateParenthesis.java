import java.util.Stack;
public class DuplicateParenthesis {
    public static boolean isDuplicate(String str){   // O(n)
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // closeing condition
            if( ch==')' ){
                int count=0;
                while( s.peek() != '(' ){
                    s.pop();
                    count++;
                }
                if(count<1){    // duplicate exists
                    return true;
                } else{
                    s.pop();
                }
            } else{  // opening + operator + operands
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(((a+b)+(c+d)))";
        System.out.println(isDuplicate(str));
    }
}
