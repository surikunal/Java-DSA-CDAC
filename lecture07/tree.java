package lecture07;

public class tree {
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

    public static int height(Node node) {
        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);
        int ans = Math.max(left, right) + 1;
        return ans;
        // return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static int size(Node node) {
        if (node == null) {
            return 0;
        }
        // int left = size(node.left);
        // int right = size(node.right);
        // int ans = left + right + 1;
        // return ans;
        return size(node.left) + size(node.right) + 1;
    }

    static int mini = Integer.MAX_VALUE;
    public static void mini(Node node) {
        if (node == null) return;

        mini(node.left);
        mini(node.right);
        mini = Math.min(mini, node.data);
    }

    static int maxi = Integer.MIN_VALUE;
    public static void maxi(Node node) {
        if (node == null) return;

        maxi = Math.max(maxi, node.data);
        maxi(node.left);
        maxi(node.right);
    }

    public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 40, -1, -1, 50, -1, -1, 30, 60, -1, -1, 70, -1, -1 };
        tree(arr);

        System.out.println("height: " + height(root));

        System.out.println("size: " + size(root));

        mini(root);
        System.out.println("Mini : " + mini);

        maxi(root);
        System.out.println("Maxi : " + maxi);

        System.out.print("Inorder: ");
        inorderTraversal(root);
        System.out.println();
        System.out.print("Preorder: ");
        preorderTraversal(root);
        System.out.println();
        System.out.print("Postorder: ");
        postorderTraversal(root);
        
    }

    // public static int func(int n) {
    //     if (n == 0 || n == 1)
    //         return n;

    //     int ans = 0;
    //     ans += func(n - 1); // left
    //     ans += func(n - 2); // right

    //     return ans + 3;
    // }
}
