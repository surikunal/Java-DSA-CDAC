package Lecture05;

public class sorting {
    public static void main(String[] args) {

        int[] arr = { 5, 9, 8, 2, 1 };
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if ( arr[j] > arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
