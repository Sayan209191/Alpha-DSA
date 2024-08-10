import java.util.*;

public class MinCostSpanningTree {

    // Minimum cost spanning tree using Prims Algorithm 

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
    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int vertex;
        int cost;

        public Pair(int v, int c) {
            this.vertex = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgorithm(ArrayList<Edge>[] graph) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        int cost = 0;
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.vertex]) {
                vis[curr.vertex] = true;
                cost += curr.cost;
                for(int i=0; i<graph[curr.vertex].size(); i++) {
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Minimun cost : "+ cost);
    }
    public static void main(String[] args) {
        /* 
                    (0)
                   / | \
              10  /  |  \ 15
                 /   |   \
               (1)   |30 (2) 
                \    |    /
             40  \   |   / 50
                  \  |  /
                    (3)
         */
        
         int V=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        primsAlgorithm(graph);
    }
}

