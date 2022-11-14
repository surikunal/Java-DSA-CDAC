package lecture11;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        int n = 7;
        boolean[] vis = new boolean[n];
        bfs(0, 6, vis);
    }

    public static void bfs(int src, int dest, boolean[] vis) {
        Queue<Integer> que = new LinkedList<>();
        // Queue<Integer> que = new Queue<>();
        que.addLast(src);
        int level = 1;
        while ( que.size() != 0 ) {
            int size = que.size();
            while (size-- > 0) {
                int rem = que.removeFirst();

                if ( vis[rem] ) {
                    System.out.println("Cycle available");
                    continue;
                }

                // logic
                vis[rem] = true;
                for ( Edge e: graph[rem] ) {
                    if ( vis[e.v] == false ) {
                        que.addLast(e.v);
                    }
                }
            }
            level++;
        }
    }
}




// https://www.linkedin.com/in/surikunal28/