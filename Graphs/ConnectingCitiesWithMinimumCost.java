import java.util.*;

public class ConnectingCitiesWithMinimumCost {
    // connect all cities with minimum cost --> prims algorithm 
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
    public static void createGraph(int cities[][], ArrayList<Edge>[] graph) {

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<cities.length; i++) {
            for(int j=0; j<cities[0].length; j++) {
                if(cities[i][j] != 0) {
                    graph[i].add(new Edge(i, j, cities[i][j]));
                }
            }
        }
    }
    public static int minCost(int cities[][]) {

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[cities.length];
        createGraph(cities, graph);

        boolean vis[] = new boolean[cities.length];
        int cost = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, cities[0][0]));

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
        return cost;
    }

    // Another Approch without creating graph(Adjacency list)

    static class Edges implements Comparable<Edges> {
        int dest;
        int cost;
        
        public Edges(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edges e1) {
            return this.cost - e1.cost;
        }
    }    
    public static int minimumCost(int cities[][]) {

        boolean vis[] = new boolean[cities.length];
        int cost = 0;

        PriorityQueue<Edges> pq = new PriorityQueue<>();
        pq.add(new Edges(0, cities[0][0]));

        while(!pq.isEmpty()) {
            Edges curr = pq.remove();

            if(!vis[curr.dest]) {
                vis[curr.dest] = true;
                cost += curr.cost;
                
                for(int i=0; i<cities[curr.dest].length; i++) {
                    if(cities[curr.dest][i] != 0) {
                        pq.add(new Edges(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int cities[][] = {{0, 1, 2, 3, 4},
                          {1, 0, 5, 0, 7},
                          {2, 5, 0, 6, 0},
                          {3, 0, 6, 0, 0},
                          {4, 7, 0, 0, 0} };

        System.out.println(minCost(cities));                          
                                  
    }
}
