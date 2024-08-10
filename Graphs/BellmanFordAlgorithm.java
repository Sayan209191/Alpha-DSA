import java.util.*;

public class BellmanFordAlgorithm {

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
        
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src) {

        int V = graph.length;
        int dis[] = new int[V];
        for(int i=0; i<V; i++) {
            if(i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
       
        // Relaxation V-1 time in all edges

        for(int i=0; i<V-1; i++) {
            for(int j=0; j<V; j++) {
                for(int k=0; k<graph[j].size(); k++) {
                    Edge e = graph[j].get(k);

                    if(dis[e.src] != Integer.MAX_VALUE && dis[e.src]+e.wt<dis[e.dest] ) {
                        dis[e.dest] = dis[e.src]+e.wt;
                    }
                }
            }
        }

        // Print the result

        for(int i=0; i<dis.length; i++) {
            System.out.println(src+" -> "+i+" = "+dis[i]);
            // System.out.print(dis[i]+" ");
        }

        System.out.println();
        
    }
    public static void main(String[] args) {
        /*           -1
             (1)<--------------(4)
           2 ^|                 ^
            / |                 |
          (0) |-4               |
           4 \|                 | 4
             ~~                 |
              (2)------------>(3)
                     2
         */
        int V=5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        bellmanFord(graph, 0);
    }
}
