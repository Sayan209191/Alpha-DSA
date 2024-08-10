import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues{
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); 

        // for priority --> to maximum 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 

        pq.add(4);  // log n
        pq.add(3);  
        pq.add(1);
        pq.add(7);
        pq.add(8);
        pq.add(2);
        pq.add(5);

        while(! pq.isEmpty()) {
            System.out.print(pq.peek()+ " ");
            pq.remove();
        }
    }
}