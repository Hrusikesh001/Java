import java.util.*;
public class Root_to_leaf_path_05 {
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

    public static void printRootToLeafPaths(Node root, List<Integer> path) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }

        // Add the current node's value to the path
        path.add(root.data);

        // If it's a leaf node, print the path
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            // Recursively explore the left and right subtrees
            printRootToLeafPaths(root.left, path);
            printRootToLeafPaths(root.right, path);
        }

        // Backtrack: Remove the current node's value from the path
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        List<Integer> path = new ArrayList<>();
        printRootToLeafPaths(root, path);
    }
}
