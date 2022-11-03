class Linkedlist {

    class Node {
        int data = 0;
        Node next = null;

        Node () {}  // default / non paramaterised

        Node (int data) {   // paramaterised
            this.data = data;
        }

        Node (int data, Node next) {  // paramaterised 
            this.data = data;
            this.next = next;
        }
    }

    public static Node head = null; // pointer
    public static Node tail = null;

    public static void addStart(int data) {
        Node newNode = new Node(data);  // creating a new node
        if ( head == null ) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void addAt(int data, int k) {
        Node newNode = new Node(data);  // created a node
        
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        Node curr = head;
        k--;
        while ( k != 0 ) {
            curr = curr.next;
            k--;
        }

        Node curr01 = curr.next;

        curr.next = newNode;
        newNode.next = curr01;
    }

    public static void main(String[] args) {
        addStart(10);
        addLast(20);
    }
}