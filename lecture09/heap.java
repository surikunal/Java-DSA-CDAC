package lecture09;

import java.util.PriorityQueue;

public class heap {
    public static class pair {
        int ele;
        int i;
        int j;
        
        pair() {}

        pair(int ele, int i, int j) {
            this.ele = ele;
            this.i = i;
            this.j = j;
        }
    }

    public static int kthSmallest(int[][] arr, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>( (pair a, pair b) -> { // lambda expression
            return a.ele - b.ele; // ascending order
            // return b.ele - a.ele;    // decending order
        });

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            pq.add( new pair( arr[i][0], i, 0 ) );
        }

        while ( --k > 0 ) {
            pair p = pq.poll(); // pop top value

            int val = p.ele;
            int x = p.i;
            int y = p.j;

            if ( ++y < m ) {
                pq.add( new pair( arr[x][y], x, y ) );
            }
        }

        pair ans = pq.poll();
        int final_ans = ans.ele;

        return final_ans;
        // return pq.poll().ele;
    }

    public static void main(String[] args) {

    }
}
