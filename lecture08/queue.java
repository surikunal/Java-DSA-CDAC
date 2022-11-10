public class queue {
    int[] que;
    int head = 0; // starting index where we will insert a value
    int tail = -1; // index where we will remove an element
    int size = 0;

    queue() {   //default
        que = new int[10];
    }

    queue(int size) {
        que = new int[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {
        if (size == que.length) {
            System.out.println("Queue is full");
            return;
        }
        tail = (tail + 1) % que.length;
        que[tail] = data;
        size++;
    }

    public int pop() {
        if (size == 0) {
            System.out.print("Queue is Empty");
            return -1;
        }

        int val = que[head];
        que[head] = 0;
        size--;

        head = (head + 1) % que.length;
        return val;
    }

    public int front() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return que[head];
    }

    public int rear() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return que[tail];
    }
}
