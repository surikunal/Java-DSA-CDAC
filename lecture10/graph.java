import java.util.ArrayList;

public class graph {

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
        addEdge(1, 2, 10);
        addEdge(1, 3, 10);
        addEdge(3, 4, 10);
        addEdge(2, 4, 40);
        addEdge(2, 5, 2);
        addEdge(5, 6, 4);
        addEdge(5, 7, 7);
        addEdge(6, 7, 5);

        removeEdge(3, 4);
    }
}
