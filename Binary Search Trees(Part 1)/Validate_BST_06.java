import java.util.*;
public class Validate_BST_06 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            // Insert in the left subtree
            root.left = insert(root.left, val);
        } else {
            // Insert in the right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true; // An empty tree is a valid BST
        }

        // Check if the current node's value is within the valid range
        if ((min != null && root.data <= min.data) || (max != null && root.data >= max.data)) {
            return false; // Violation of BST property
        }

        // Recursively check the left and right subtrees with updated ranges
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        boolean isValid = isValidBST(root, null, null);
        System.out.println("Is the tree a valid BST? " + isValid);
    }
}
