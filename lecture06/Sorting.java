package lecture06;

class Sorting {

    public static void main(String[] args) {
        // int[] arr = { 9, 2, 5, 6, 1 };
        // selectionSort(arr);
        // insertionSort(arr);

        // int target = 3;
        // partitionArray(arr, target);

        // int[] arr = { 8, 5, 1, 3, 7, 2, 9, 6 };
        // quickSort(arr, 0, arr.length - 1);

        // int[] arr1 = { 2, 4, 6, 9 };
        // int[] arr2 = { 1, 5, 10 };
        // merge2SortedArrays(arr1, arr2);

        int[] arr = { 3, 5, 1, 2, 7, 9, -1, 4 };
        mergeSort(arr, 0, arr.length - 1);
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) { // base case
            int[] base = new int[1];
            base[0] = arr[lo];
            return base;
        }

        int mid = (lo + hi) / 2;
        int[] left = mergeSort(arr, lo, mid);    // left call
        int[] right = mergeSort(arr, mid + 1, hi);    // right call
        int[] ans = merge2SortedArrays(left, right);
        return ans;
    }

    public static int[] merge2SortedArrays(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = arr[hi];
        int pi = partitionArray(arr, pivot); // pivot index
        quickSort(arr, lo, pi - 1); // left call
        quickSort(arr, pi + 1, hi); // right call
    }

    public static int partitionArray(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;

        int itr = 0, ptr = 0;
        while (itr <= end) {
            if (arr[itr] <= tar) {
                swap(arr, itr, ptr);
                itr++;
                ptr++;
            } else {
                itr++;
            }
        }

        return (ptr - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // each iteration for each element

            int idx = i;
            for (int j = i + 1; j < arr.length; j++) { // find smallest element
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            swap(arr, i, idx);
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // each iteration for each element
            for (int j = i - 1; j >= 0; j--) { // finding correction index to place the element
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}