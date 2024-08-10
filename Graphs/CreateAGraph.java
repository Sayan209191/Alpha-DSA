import java.util.*;

public class CreateAGraph {

    
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
    public static void main(String[] args) {
        /*
           (0)    (2)--------- (4)
             \ 5  / \     2
              \  /   \ 1
               (1)----(3)
                   3
         */
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph [] = new ArrayList[V];

        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Vertex - 0
        graph[0].add(new Edge(0, 1, 5));

        // Vertex - 1

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // Vertex - 2

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3,1));
        graph[2].add(new Edge(2, 4, 2));

        // Vertex - 3

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // Vertex - 4

        graph[4].add(new Edge(4,2,2));


        // Printing neighbours of all vertex

        for(int i=0; i<graph.length; i++) {
            System.out.println("vertex -> "+i);
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.println(i+"-->"+e.dest);
            }
            System.out.println();
        }
    }
}