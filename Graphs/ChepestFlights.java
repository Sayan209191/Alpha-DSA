import java.util.*;

public class ChepestFlights {
    static class Edge {
        int src; 
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(int flights[][],ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++) {
            graph[flights[i][0]].add(new Edge(flights[i][0], flights[i][1], flights[i][2]));
        }
    }
    static class Info {
        int vertex;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }
    public static int minCost(int flights[][],int n, int src, int dest, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[n];

        createGraph(flights, graph);

        int cost[] = new int[n];
        for(int i=0; i<n; i++) {
            if(i != src) {
                cost[i] = Integer.MAX_VALUE;
            }
        }
        // boolean vis[] = new boolean[n];
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr.stops > k) {
                break;
            }

            for(int i=0; i<graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);

                int v = e.dest; 
                int c = e.wt;

                if(curr.cost + c < cost[v] && curr.stops <= k) {
                    cost[v] = curr.cost + c;
                    q.add(new Info(v, cost[v], curr.stops+1));
                }
            }
        }

        return cost[dest] == Integer.MAX_VALUE? -1: cost[dest];
    }
    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0, 1, 100},{1, 2, 100},{2, 0, 100},{1, 3, 600},{2, 3, 200}};

        int src = 0;
        int dest = 3;
        int k = 1; 

        System.out.println(minCost(flights, n, src, dest, k));
    }
}
