import java.util.*;
public class Size_of_largest_BST_03 {
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

    public static class Info {
        int size; // Size of the subtree
        int min;  // Minimum value in the subtree
        int max;  // Maximum value in the subtree
        boolean isBST; // Whether the subtree is a BST

        public Info(int size, int min, int max, boolean isBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if(root == null) {
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        
        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(size, min, max, false);
        }
        if(leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(size, min, max, true);
        }
        return new Info(Math.max(leftInfo.size, rightInfo.size), min, max, false);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info result = largestBST(root);
        System.out.println("Size of the largest BST is: " + maxBST);
    }
}
