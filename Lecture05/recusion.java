package Lecture05;

public class recusion {
    public static void main(String[] args) {
        // int[] arr = { 2, 1, 3, 5, -2, 8, 7, 6, 2, 5, 1};
        // mini(arr, 0);
        // System.out.println(find(arr, 0, 13));

        // System.out.println(fibo(100));
        int[] arr = { 1, 3, 2, 5, 1, 2, 7, 1, 3, 5, 8 };
        int target = 1;
        System.out.println(findLastIdx(arr, target, 0));
    }

    public static int mini(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int ans = mini(arr, idx + 1);
        if ( arr[idx] < ans ) {
            ans = arr[idx];
        }
        return ans;
    }

    public static int maxi(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int ans = maxi(arr, idx + 1);
        if ( arr[idx] > ans ) {
            ans = arr[idx];
        }
        return ans;
    }

    public static boolean find(int[] arr, int idx, int data) {
        if ( idx == arr.length ) {
            return false;
        }
        if ( arr[idx] == data ) {
            return true;
        }
        boolean ans = find (arr, idx + 1, data);
        return ans;
    }


    public static int fibo(int n) {
        if (n <= 1)
            return n;

        // if (n == 0) return 0;
        // if (n == 1) return 1;

        int a = fibo(n - 1);
        int b = fibo(n - 2);
        int ans = a + b;
        return ans;
    }


    public static int findLastIdx(int[] arr, int target, int idx) {

        if ( idx == arr.length ) {
            return -1;  // -1: we have'nt found our ans yet
        }

        int ans = findLastIdx(arr, target, idx + 1);

        if (ans != -1) {    // we found our ans
            return ans;
        } else {       // we have'nt found our ans yet
            // if ( arr[idx] == target ) {
            //     return idx;
            // } else {
            //     return -1;
            // }
            return arr[idx] == target ? idx : -1;   // ternary operator
        }
    }

}
