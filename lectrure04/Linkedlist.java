package lectrure04;

public class Linkedlist {
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
    // reverse of Linkedlist (leetcode 206)
    public static Node reverseOfLL(Node head) {
        // main logic
        Node curr = head;
        Node prev = null;

        while ( curr != null ) {
            Node temp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // check palindrome linkedlist (leetcode 234)
    public Node mid(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        while ( curr != null ) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = mid(head);
        Node mid01 = mid.next;

        mid.next = null;

        mid01 = reverse(mid01);

        while ( head != null && mid01 != null ) {
            if (head.data != mid01.data) {
                return false;
            }
            head = head.next;
            mid01 = mid01.next;
        }
        return true;
    }
}
