import java.util.Stack;
public class ReverseAStack {
    // Reverse a stack 

    // broutforce solution   --> Tc-> O(n) , Sc -> O(n)
    public static Stack<Integer> reverseStack(Stack<Integer> s){
        Stack<Integer> ans=new Stack<>();
        while(! s.isEmpty()){
            int top=s.pop();
            ans.push(top);
        }
        return ans;
    }

    // Optimize Solution --> Tc-> O(n) , Sc-> O(1)
    
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        System.out.println(s1);

        // Stack<Integer> ans=reverseStack(s1);
        // System.out.println(ans);
        reverse(s1);
        System.out.println(s1);
    }
}
