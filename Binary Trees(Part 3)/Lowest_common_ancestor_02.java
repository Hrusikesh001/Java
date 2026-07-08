import java.util.*;

public class Lowest_common_ancestor_02 {
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

    public static Node lowestCommonAncestor(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q) {
            return root;
        }

        Node leftLCA = lowestCommonAncestor(root.left, p, q);
        Node rightLCA = lowestCommonAncestor(root.right, p, q);

        if(rightLCA == null) {
            return leftLCA;
        }
        if(leftLCA == null) {
            return rightLCA;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int p = 4; // Change this value to test different nodes
        int q = 7; // Change this value to test different nodes

        Node lca = lowestCommonAncestor(root, p, q);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + lca.data);
        } else {
            System.out.println("Lowest Common Ancestor not found.");
        }
    }
}
