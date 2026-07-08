import java.util.*;

public class Kth_level_01 {
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

    public static void printKthLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        printKthLevel(root.left, k - 1);
        printKthLevel(root.right, k - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2; // Change this value to print different levels
        System.out.println("Nodes at level " + k + ":");
        printKthLevel(root, k);
    }
}
