import java.util.*;
public class Transform_to_sum_tree_05 {
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

    public static int transformToSumTree(Node root) {
        if (root == null) {
            return 0; // Base case: empty subtree
        }

        // Recursively transform the left and right subtrees
        int leftSum = transformToSumTree(root.left);
        int rightSum = transformToSumTree(root.right);

        // Store the original value of the current node
        int originalValue = root.data;

        // Update the current node's value to the sum of its left and right subtrees
        root.data = leftSum + rightSum;

        // Return the sum of the original value and the updated value of the current node
        return originalValue + root.data;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Inorder traversal before transformation:");
        inorderTraversal(root);
        System.out.println();

        transformToSumTree(root);

        System.out.println("Inorder traversal after transformation:");
        inorderTraversal(root);
        System.out.println();

        System.out.println("Preorder traversal after transformation:");
        preorderTraversal(root);
        System.out.println();
    }
}
