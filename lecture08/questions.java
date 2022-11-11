import java.util.Stack;

public class questions {
    public static void nextSmallerOnRight(int[] arr) {  // on based of index
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0) {
                st.push(i);
                continue;
            }

            while (st.size() != 0 && arr[st.peek()] > arr[i]) {
                System.out.println(arr[st.peek()] + "->" + arr[i]);
                st.pop();
            }

            st.push(i);
        }

        while (st.size() != 0) {
            System.out.println(arr[st.peek()] + "->" + "-1");
            st.pop();
        }
    }

    // all other on based of value  ===============================================

    public static void nextGreaterOnRight(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0) {
                st.push(arr[i]);
                continue;
            }

            while (st.size() != 0 && st.peek() < arr[i]) {
                System.out.println(st.peek() + "->" + arr[i]);
                st.pop();
            }

            st.push(arr[i]);
        }

        while (st.size() != 0) {
            System.out.println(st.peek() + "->" + "-1");
            st.pop();
        }
    }

    public static void nextSmallerOnLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.size() == 0) {
                st.push(arr[i]);
                continue;
            }

            while (st.size() != 0 && st.peek() > arr[i]) {
                System.out.println(st.peek() + "->" + arr[i]);
                st.pop();
            }

            st.push(arr[i]);
        }

        while (st.size() != 0) {
            System.out.println(st.peek() + "->" + "-1");
            st.pop();
        }
    }

    public static void nextGreaterOnLeft(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.size() == 0) {
                st.push(arr[i]);
                continue;
            }

            while (st.size() != 0 && st.peek() < arr[i]) {
                System.out.println(st.peek() + "->" + arr[i]);
                st.pop();
            }

            st.push(arr[i]);
        }

        while (st.size() != 0) {
            System.out.println(st.peek() + "->" + "-1");
            st.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 7, 3 };
        nextSmallerOnRight(arr);
        // nextGreaterOnRight(arr);
    }
}
