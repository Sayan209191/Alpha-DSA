import java.util.*;

public class KhansAlgorithm {
    // Topological Sort unsing BFS algorithm / traversal
    static class Edge {
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

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void calIndegree(ArrayList<Edge>[] graph, int indree[]) {
        for(int i=0; i<graph.length; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indree[e.dest]++;
            }
        }
    }

    public static void topoSort(ArrayList<Edge>[] graph) {

        int indree[] = new int[graph.length];
        calIndegree(graph, indree);

        Queue<Integer> q  = new LinkedList<>();

        for(int i=0; i<indree.length; i++) {
            if(indree[i] == 0) {
                q.add(i);
            }
        }

        // bfs

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indree[e.dest]--;
                if(indree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        /*
            (2)------>(3)-------->(1)
             ^                     ^
             |                     |
             |                     |
             |                     |
            (5)----->(0)<---------(4)

         */
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        topoSort(graph);

    }
}
