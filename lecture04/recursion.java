package lecture04;

public class recursion {

    public static void inc(int a, int b) {
        if ( a == b + 1 ) { // base case
            return;
        }
        inc(a, b - 1);  // recursion call
        System.out.print(b + " ");
    }

    public static void dec(int a, int b) {
        if ( a == b + 1 ) { // base case
            return;
        }

        System.out.print(b + " ");

        dec(a, b - 1);  // recursion call
    }

    public static void oddEven(int a, int b) {
        if (a == b + 1) return;

        if (b % 2 == 0)
            System.out.print(b + " ");

        oddEven(a, b - 1);  // recusion call

        if (b % 2 != 0)
            System.out.print(b + " ");
    }

    public static void main(String[] args) {
        // inc(1, 100);
        // System.out.println();
        // dec(1, 10);

        oddEven(1, 10);
        return;
    }
}
