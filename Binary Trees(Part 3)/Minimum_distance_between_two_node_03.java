import java.util.*;

public class Minimum_distance_between_two_node_03 {
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

    public static Node lowestCommonAncestor(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q) {
            return root;
        }

        Node leftLCA = lowestCommonAncestor(root.left, p, q);
        Node rightLCA = lowestCommonAncestor(root.right, p, q);

        if(rightLCA == null) {
            return leftLCA;
        }
        if(leftLCA == null) {
            return rightLCA;
        }
        return root;
    }

    public static int findDistance(Node root, int target, int distance) {
        if (root == null) {
            return -1; // Target not found
        }
        if (root.data == target) {
            return distance; // Target found
        }

        // Search in the left subtree
        int leftDistance = findDistance(root.left, target, distance + 1);
        if (leftDistance != -1) {
            return leftDistance; // Target found in the left subtree
        }

        // Search in the right subtree
        return findDistance(root.right, target, distance + 1);
    }

    public static int minDistance(Node root, int p, int q) {
        Node lca = lowestCommonAncestor(root, p, q);
        int distanceP = findDistance(lca, p, 0);
        int distanceQ = findDistance(lca, q, 0);
        return distanceP + distanceQ;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int p = 4; // Change this value to test different nodes
        int q = 7; // Change this value to test different nodes

        int distance = minDistance(root, p, q);
        System.out.println("Minimum distance between " + p + " and " + q + " is : " + distance);
    }
}
 