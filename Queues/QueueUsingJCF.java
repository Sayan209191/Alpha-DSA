import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        Queue <Integer> q1=new ArrayDeque<>();
        q1.add(4);
        q1.add(5);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
