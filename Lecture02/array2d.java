package Lecture02;

public class array2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
        };

        // print 2d array
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (arr[i][j] > max) {
        //             max = arr[i][j];
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println(max);


        // wave 01
        // for (int i = 0; i < arr.length; i++) {  // rows
        //     if ( i % 2 == 0 ) { // even
        //         for (int j = 0; j < arr[i].length; j++) {   // cols
        //             System.out.print(arr[i][j] + " ");
        //         }
        //     } else { // odd
        //         for (int j = arr[i].length - 1; j >= 0; j--) {  // cols
        //             System.out.print(arr[i][j] + " ");
        //         }
        //     }
        // }

        // wave 02
        for (int j = 0; j < arr[0].length; j++) {  // cols
            if ( j % 2 == 0 ) { // even
                for (int i = 0; i < arr.length; i++) {   // rows
                    System.out.print(arr[i][j] + " ");
                }
            } else { // odd
                for (int i = arr.length - 1; i >= 0; i--) {  // rows
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
