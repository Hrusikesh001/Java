import java.util.*;
public class Mirror_a_BST_07 {
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

    public static Node mirror(Node root) {
        if (root == null) {
            return null; // Base case: If the node is null, return
        }

        Node leftMirror = mirror(root.left); 
        Node rightMirror = mirror(root.right);

        root.left = rightMirror; 
        root.right = leftMirror;
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }
        
        inorder(root.left); // Traverse the left subtree
        System.out.print(root.data + " "); // Visit the current node
        inorder(root.right); // Traverse the right subtree
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        System.out.println("Inorder traversal of original BST:");
        inorder(root);
        
        mirror(root); // Mirror the BST
        
        System.out.println("\nInorder traversal of mirrored BST:");
        inorder(root);
    }
}
