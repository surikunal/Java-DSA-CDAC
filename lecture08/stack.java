public class stack {
    // stack is array

    int[] stack;
    int tos = -1;    // top of stack

    stack() {   // default
        stack = new int[10];
    }

    stack(int size) {
        stack = new int[size];
    }

    public int size() {
        return tos + 1;
    }

    public boolean isEmpty() {
        // if (tos == -1)
        //     return true;
        // else
        //     return false;

        return (tos == -1);
    }

    public void push(int data) {
        if (tos == stack.length - 1) {
            System.out.print("Stack is full");
            return;
        }
        int idx = tos + 1;
        stack[idx] = data;

        // stack[++tos] = data;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int val = stack[tos];
        stack[tos] = 0;
        tos--;
        return val;
    }

    public int top() {
        return stack[tos];
    }
}
