public class midOfLL {
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

    public static void mid(Node head) {

        if ( head == null) {
            System.out.println(-1);
            return;
        }

        if (head.next == null ) {
            System.out.println(head.data);
            return;
        }

        Node slow = head;
        Node fast = head;

        while ( fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.print(slow.data);
    }

}
