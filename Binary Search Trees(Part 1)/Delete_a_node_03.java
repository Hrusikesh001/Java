import java.util.*;

public class Delete_a_node_03 {
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

    public static Node delete(Node root, int val) {
        if(root.data < val){
            root.right = delete(root.right, val);
        } else if(root.data > val){
            root.left = delete(root.left, val);
        } else {
            // Node to be deleted found
            if(root.left == null && root.right == null){
                return null; // Case 1: No children
            } else if(root.left == null){
                return root.right; // Case 2: One child (right)
            } else if(root.right == null){
                return root.left; // Case 2: One child (left)
            } else {
                // Case 3: Two children
                Node minNode = findMin(root.right); // Find the minimum node in the right subtree
                root.data = minNode.data; // Replace the value of the node to be deleted with the minimum value
                root.right = delete(root.right, minNode.data); // Delete the minimum node from the right subtree
            }
        }
        return root;
    }

    private static Node findMin(Node node) {
        while (node.left != null) {
            node = node.left; // Keep going left to find the minimum value
        }
        return node;
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
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 10);
        inorder(root);
    }
}
