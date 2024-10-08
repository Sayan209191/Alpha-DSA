import java.util.*;

public class DetectCycleInUndirectedGraph {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,0));
        graph[4].add(new Edge(4,2));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(!visited[i]) {
                if(detectCycleUtil(graph,visited,i,-1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean visted[],int curr,int par) {
        
        visted[curr] = true;
        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(!visted[e.dest]) {
                if(detectCycleUtil(graph, visted, e.dest, curr)) {
                    return true;
                }
            } else if(visted[e.dest] && e.dest!= par) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        /*
              (0)---------(3)
              /|            
           (1) |                
              \|             
              (2)---------(4)
         */
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
