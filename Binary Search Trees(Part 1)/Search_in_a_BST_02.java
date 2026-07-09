import java.util.*;

public class Search_in_a_BST_02 {
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

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false; // Base case: key not found
        }
        if (root.data == key) {
            return true; // Key found
        }
        if (key < root.data) {
            return search(root.left, key); // Search in the left subtree
        } else {
            return search(root.right, key); // Search in the right subtree
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        int keyToSearch = 4;
        boolean isFound = search(root, keyToSearch);
        System.out.println("Is " + keyToSearch + " found in the BST? " + isFound);
    }
}
