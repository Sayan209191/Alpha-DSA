import java.util.PriorityQueue;

public class ConnectNRopes {

    public static int minCost(int ropes[],int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int minCost = 0;
        for(int i=0;i<n;i++) {
            pq.add(ropes[i]);
        }

        while(pq.size()>1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            int cost = min1 + min2;
            minCost += cost;
            pq.add(cost);
        } 

        return minCost;
    }
    public static void main(String[] args) {
        int ropes[] = {3,1,2,3,6};
        System.out.println(minCost(ropes, ropes.length));
    }
}
