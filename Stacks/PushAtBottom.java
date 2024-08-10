import java.util.Stack;
public class PushAtBottom {
    // Push a element in stack at Bottom
    // Amazon
    public static void pushAtBottom(Stack<Integer> s, int data){
        // Base case -> when stack empty push data
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        int new_item=4;
        pushAtBottom(s, new_item);
        pushAtBottom(s, 5);
        pushAtBottom(s, 6);
        // System.out.println(s);
        while(! s.isEmpty()){
            int top=s.pop();
            System.out.println(top);
        }
    }
}
