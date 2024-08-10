import java.util.*;

public class HaveAnyExistingPath{

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
            this.wt = 1;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean visted[]){
        if(src == dest) {
            return true;
        }
        visted[src] = true;
        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!visted[e.dest] && hasPath(graph, e.dest, dest, visted)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*
              (1)---------(3)
              /            | \
           (0)             | (5)----(6)
              \            | /
              (2)---------(4)
         */
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);

        System.out.println(hasPath(graph, 0, 7, new boolean[V]));
    }
}