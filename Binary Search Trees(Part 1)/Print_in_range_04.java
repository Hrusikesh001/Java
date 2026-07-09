import java.util.*;
public class Print_in_range_04 {
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

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }

        // Check if the current node's value is within the range [x, y]
        if (root.data >= x && root.data <= y) {
            System.out.print(root.data + " "); // Print the value if it's in range
        }

        // Recursively check the left and right subtrees
        printInRange(root.left, x, y);
        printInRange(root.right, x, y);
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        printInRange(root, 5, 12);
    }
}
