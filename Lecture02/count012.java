package Lecture02;

public class count012 {
    public static void swap(int[] arr, int itr, int ptr) {
        int temp = arr[itr];
        arr[itr] = arr[ptr];
        arr[ptr] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 1, 0, 1, 2, 1, 0, 0, 0, 1 };
        count012(arr);
    }

    public static void count012(int[] arr) {
        int itr = 0;
        int ptr1 = 0;
        int ptr2 = arr.length - 1;

        while ( itr <= ptr2 ) {
            if ( arr[itr] == 0 ) {
                swap( arr, itr, ptr1 );
                itr++;
                ptr1++;
            } else if (arr[itr] == 2) {
                swap(arr, itr, ptr2);
                ptr2--;
            } else {
                itr++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
