package Lecture01;
import java.util.Scanner;

class Lecture01 {

    public static void reverse(int[] arr, int n) {
        // 1, 2, 3, 4, 5, 6, 7
        int i = 0;
        int j = n - 1;

        while (i < j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // for (int a: arr) {
        // System.out.print(a + ", ");
        // }
    }

    public static void fibo(int n) { // fibbonacci seriers
        int a = 0;
        int b = 1;
        if (n >= 1) {

            if (n == 1) {
                System.out.print(a + ",");
                return;
            }

            if (n == 2) {
                System.out.print(a + "," + b + ", ");
                return;
            }

            // generic code
            int sum = 0;
            System.out.print(a + ", " + b + ", ");
            for (int i = 3; i <= n; i++) {
                // sliding window
                sum = a + b;
                a = b;
                b = sum;
                System.out.print(sum + ", ");
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse01(int[] arr, int si, int ei) {
        while (si < ei) {
            swap(arr, si, ei);
            si++;
            ei--;
        }

        // for (int i = si, j = ei; i < j; i++, j--)
    }

    public static void rotateOfArray(int[] arr, int n, int k) {
        // for large test cases
        k = k % n;
        // for negetive test cases
        if (k < 0) {
            k = k + n;
        }
        // main logic
        reverse01(arr, n - k, n - 1); // reverse last part
        reverse01(arr, 0, n - k - 1); // reverse remaining
        reverse01(arr, 0, n - 1); // reverse whole array
    }

    public static void binarySearch(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                System.out.print(mid);
                return;
            } else if (arr[mid] < target) {
                si = mid + 1;
            } else if (arr[mid] > target) {
                ei = mid - 1;
            }
        }
    }

    public static int binarySearchLowerBound(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                if (mid - 1 >= 0 && arr[mid] == arr[mid - 1]) {
                    ei = mid - 1;
                } else {
                    return mid;
                }
            } else if (arr[mid] < target) {
                si = mid + 1;
            } else if (arr[mid] > target) {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static void binarySearchUpperBound(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == target) {
                if (mid + 1 < arr.length && arr[mid] == arr[mid + 1]) { // target == arr[mid + 1]
                    si = mid + 1;
                } else {
                    System.out.print(mid);
                }
                return;
            } else if (arr[mid] < target) {
                si = mid + 1;
            } else if (arr[mid] > target) {
                ei = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();

        // // declare an array
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = scn.nextInt();
        // }

        // int target = scn.nextInt();

        // reverse(arr, n);
        // fibo(n);
        // rotateOfArray(arr, n, k);

        int[] arr01 = { 1, 2, 5, 6, 8, 9, 12, 12, 12 , 14, 16, 17, 19, 20, 22 };
        int target = 12;
        // binarySearch(arr01, target);
        System.out.println(binarySearchLowerBound(arr01, target));

    }
}
