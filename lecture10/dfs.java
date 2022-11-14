import java.util.ArrayList;

public class dfs {
    public static ArrayList<Edge>[] graph = new ArrayList[7];

    public static class Edge {
        int v;  // value of nbr node
        int w;  // weight of edge

        Edge() {}
        
        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    public static void build() {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    }

    public static void addEdge(int u, int v, int w) {
        if ( u < 0 || v < 0 || u >= graph.length || v >= graph.length ) return;

        graph[u].add( new Edge(v, w) );
        graph[v].add( new Edge(u, w) );
    }

    public static void removeEdge(int u, int v) {
        for (int i = 0; i < graph[u].size(); i++) {
            if ( graph[u].get(i).v == v ) {
                graph[u].remove(i);
                break;
            }
        }

        for (int i = 0; i < graph[v].size(); i++) {
            if ( graph[v].get(i).v == u ) {
                graph[v].remove(i);
                break;
            }
        }
    }


    public static void removeVtx(int u) {

        while ( graph[u].size() != 0 ) {

            Edge e = graph[u].get( graph[u].size() - 1 );
            removeEdge(u, e.v);

            // ArrayList<Edge> a = graph[u];
            // int idx = graph[u].size() - 1;
            // Edge val = a.get(idx);
            // int vtx = val.v;
            // removeEdge(u, vtx);
        }

    }

    public static void display() {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "-> ");
            for (Edge e: graph[i]) {
                System.out.print("(" + e.v + "," + e.w + "), ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        build();

        // me, nbr, wt
        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(3, 2, 40);
        addEdge(1, 2, 10);
        addEdge(3, 4, 2);
        addEdge(4, 5, 3);
        addEdge(4, 6, 4);
        addEdge(5, 6, 7);

        // ============================== questions

        int n = 7;
        boolean[] vis = new boolean[n];
        hasPath(0, 6, vis);
    }

    public static void hasPath(int src, int dest, boolean[] vis) {
        dfs(src, dest, vis);
    }

    public static void dfs(int src, int dest, boolean[] vis) { //dfs algorithm
        vis[src] = true;
        for ( Edge e: graph[src] ) {
            if ( vis[e.v] == false ) {
                dfs(e.v, dest, vis);
            }
        }

        // for all paths question
        // vis[src] = false;   // again available for visiting
    }
}
