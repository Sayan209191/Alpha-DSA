import java.util.Queue;
import java.util.*;
public class QueueReversal {
    public static Queue<Integer> reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        Queue<Integer> ans = reverse(q);
        while(!q.isEmpty()) {
            System.out.print(ans.peek()+" ");
            ans.remove();
        }
    }
}
