// package lecture07;

// public class BST {
//     public class Node {
//         int data = 0;
//         Node left = null;
//         Node right = null;

//         Node() {}   // default

//         Node(int data) {
//             this.data = data;
//         }

//         Node(int data, Node left, Node right) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public static int mini(Node node) {
//         Node curr = node;
//         while (curr.left != null) {
//             curr = curr.left;
//         }
//         return curr.data;
//     }

//     public static int maxi(Node node) {
//         Node curr = node;
//         while (curr.right != null) {
//             curr = curr.right;
//         }
//         return curr.data;
//     }

//     public static boolean find(Node node, int target) {

//         if (node == null) {
//             return false;
//         }

//         if (node.data > target) {
//             return find(node.left, target);
//         } else if ( node.data < target ) {
//             return find(node.right, target);
//         } else if ( node.data == target ) {
//             System.out.println(node.data);
//             return true;
//         }   
//     }

//     public static void main(String[] args) {
        
//     }
// }
