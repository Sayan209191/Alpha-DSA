import java.util.Stack;
public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        
        while(! s.isEmpty() ){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
