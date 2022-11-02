package Lecture02;

public class lecture02 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0 };
        count01(arr); // main logic
    }

    public static void swap(int[] arr, int itr, int ptr) {
        int temp = arr[itr];
        arr[itr] = arr[ptr];
        arr[ptr] = temp;
    }

    public static void count01(int[] arr) {
        int itr = 0;
        int ptr = 0;
        while ( itr < arr.length ) {
            if ( arr[itr] == 0 ) {
                // swapping
                swap( arr, itr, ptr );
                ptr++;
                itr++;
            } else {
                itr++;
            }
        }

        for (int i: arr) {
            System.out.print(i+",");
        }
    }
}
