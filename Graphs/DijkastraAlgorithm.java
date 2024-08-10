import java.util.*;

public class DijkastraAlgorithm {

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
        
        graph[0].add(new Edge(0, 1, 2) );
        graph[0].add(new Edge(0, 2,4) );

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3,7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int p) {
            this.n = n;
            this.path = p;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkasta(ArrayList<Edge>[] graph, int src) {  // O(V+ElogV)

        int dis[] = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;
                for(int i=0; i<graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);

                    int u = e.src;
                    int v = e.dest;
                    int cost = e.wt;

                    if(dis[u]+cost < dis[v]) {
                        dis[v] = dis[u]+cost; 
                        pq.add(new Pair(v, dis[v]));
                    }
                }
            }
        }

        for(int i=0; i<dis.length; i++) {
            System.out.println(src+" -->"+i+" = "+dis[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* 
                    7      
              (1)--------->(3)
              ^|            ^ \1
           2 / | 1         2|  ~
           (0) |            |  (5)
           4 \ |            |  ^
              ~~            | /5
              (2)--------->(4)
                    3

         */


        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        dijkasta(graph, 0);
    }
}
