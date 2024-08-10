import java.util.Stack;
public class ValidParenthisis {
    // Solution using stack
    public static boolean isValid(String str){  // O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            // Opening 
            if(ch=='(' || ch=='{' || ch == '['){
                s.push(ch);
            } else{  // closeing
                if(s.isEmpty()){
                    return false;
                } 
                if((s.peek()=='(' && ch==')')
                  || (s.peek()=='{' && ch=='}')
                  || (s.peek()=='[' && ch==']')){

                    s.pop();

                } else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({[()]})";
        System.out.println(isValid(str));
    }
}
