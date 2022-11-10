import java.util.Stack;

public class questions {
    public static void nextSmallerOnRight(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
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

    public static void main(String[] args) {
        int[] arr = { 6, 3, 8, 10, 9, 7, 5 };
        nextSmallerOnRight(arr);
    }
}
