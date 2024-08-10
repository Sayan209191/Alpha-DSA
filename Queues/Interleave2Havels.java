import java.util.Queue;
import java.util.*;
public class Interleave2Havels {
    public static Queue<Integer> interleaves(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();
        int size=q.size();
        for(int i=0 ; i<size/2 ; i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1 ; i <= 10 ; i++) {
            q.add(i);
        }

        Queue<Integer> ans = interleaves(q);
        while(!q.isEmpty()) {
            System.out.print(ans.peek()+" ");
            ans.remove();
        }
    }
}
