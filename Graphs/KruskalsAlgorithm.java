import java.util.*;

public class KruskalsAlgorithm {

    static class Edge implements Comparable<Edge> {
        
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest =d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e1) {
            return this.wt - e1.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));        
        edges.add(new Edge(1, 0, 10));        
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 0, 15));
        edges.add(new Edge(2, 3, 50));
        edges.add(new Edge(3, 0, 30));
        edges.add(new Edge(3, 1, 40));
        edges.add(new Edge(3, 2, 50));
    }

    static int par[];
    static int rank[];

    public static void init(int V) {
        par = new int[V];
        rank = new int[V];
        for(int i=0; i<V; i++) {
            par[i] = i;
        }
    }
    
    public static int find(int i) {
        if(i == par[i]) {
            return i;
        }
        return par[i] = find(par[i]);
    }
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if(rank[parA] > rank[parB]) {
            par[parB] = parA;
        } else {
            par[parA] = parB;
        }
    }

    public static int kruskal(ArrayList<Edge> edges, int v) {
        
        init(v);
        Collections.sort(edges);
        int count = 0;
        int mstCost = 0;

        for(int i=0; count<v-1; i++) {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB) {
                union(e.src, e.dest);
                count++;
                mstCost += e.wt;
            }
        }

        return mstCost;

    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        System.out.println(kruskal(edges, V));
    }
}
