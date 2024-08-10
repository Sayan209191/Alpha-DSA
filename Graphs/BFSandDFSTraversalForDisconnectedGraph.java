import java.util.*;

public class BFSandDFSTraversalForDisconnectedGraph {
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
        

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        

        
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static void bfs(ArrayList<Edge>graph[]) {
        boolean visted[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!visted[i]) {
                bfsUtil(graph,i,visted);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>graph[],int st,boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(st);
        
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>graph[]){
        boolean visted[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!visted[i]) {
                dfsUtil(graph,i,visted);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>graph[],int curr,boolean visited[]) {
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                dfsUtil(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        /*
              (1)---------(3)
              /            | 
           (0)             |     (5)----(6)
              \            | 
              (2)---------(4)
         */
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph [] = new ArrayList[V];
        createGraph(graph);

        bfs(graph);
        System.out.println();
        dfs(graph);

    }
    
}
