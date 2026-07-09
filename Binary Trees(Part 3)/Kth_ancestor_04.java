import java.util.*;
public class Kth_ancestor_04 {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kthAncestor(Node root, int k, int node) {
        if (root == null) {
            return -1; // Base case: node not found
        }

        if (root.data == node) {
            return 0; // Found the target node
        }

        int leftDistance = kthAncestor(root.left, k, node);
        int rightDistance = kthAncestor(root.right, k, node);

        if (leftDistance == -1 && rightDistance == -1) {
            return -1; // Node not found in either subtree
        }

        int max = Math.max(leftDistance, rightDistance);
        if (max + 1 == k) {
            System.out.println(root.data); // Print the k-th ancestor
        }
        return max + 1; 
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2;
        int node = 5;
        kthAncestor(root, k, node);
    }
}
