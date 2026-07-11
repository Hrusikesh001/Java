import java.util.*;
public class Sorted_array_to_balanced_BST_01 {
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

    public static void preorder(Node root) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }
        
        System.out.print(root.data + " ");
        preorder(root.left); // Traverse the left subtree
        preorder(root.right); // Traverse the right subtree
    }

    public static Node createBST(int[] arr, int start, int end) {
        if (start > end) {
            return null; // Base case: If the start index exceeds the end index, return null
        }

        int mid = (start + end) / 2; // Find the middle index
        Node node = new Node(arr[mid]); // Create a new node with the middle element

        // Recursively construct the left and right subtrees
        node.left = createBST(arr, start, mid - 1);
        node.right = createBST(arr, mid + 1, end);
        return node; 
    }

    public static void main(String[] args) {
        int[] sortedArray = {3, 5, 6, 8, 10, 11, 12};
        Node root = createBST(sortedArray, 0, sortedArray.length - 1);
        preorder(root);
    }
}
