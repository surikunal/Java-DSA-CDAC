import java.util.ArrayList;

class tree {
    public static class Node {
        int data = 0;
        Node left = null;
        Node right = null;

        Node() {
        }

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static Node root = null; // head

    public static void tree(int[] arr) {
        root = construct(arr);
    }

    static int idx = 0;

    public static Node construct(int[] arr) {
        if (idx >= arr.length || arr[idx] == -1) {
            idx++;
            return null;
        }

        Node node = new Node(arr[idx], null, null);
        idx++;
        node.left = construct(arr);
        node.right = construct(arr);
        return node;
    }

    public static ArrayList<Node> rootToNodePath(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (node.data == data) {
            ArrayList<Node> base = new ArrayList<>();
            base.add(node);
            return base;
        }
        ArrayList<Node> left = rootToNodePath(node.left, data);
        if (left != null) {
            left.add(node);
            return left;
        }
        ArrayList<Node> right = rootToNodePath(node.right, data);
        if (right != null) {
            right.add(node);
            return right;
        }
        return null;
    }

    public static Node LCA(Node root, int node1, int node2) {
        ArrayList<Node> path1 = rootToNodePath(root, node1);
        ArrayList<Node> path2 = rootToNodePath(root, node2);

        int i = path1.size() - 1;
        int j = path2.size() - 1;
        Node ans = null;
        while (i >= 0 && j >= 0) {
            if ( path1.get(i).data ==  path2.get(j).data) {
                ans = path1.get(i);
            } else {
                break;
            }
            i--;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9, -1, 10, -1, -1, -1, 4, 8, -1, 12, 13, -1, -1, -1, 11, -1, -1, 3, 14, -1, -1, 6, 7, -1,
                -1, -1 };
        tree(arr);

        Node fans = LCA(root, 11, 13);
        System.out.println(fans.data);
    }
}