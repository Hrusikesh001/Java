import java.util.*;

public class Diameter_of_Tree_01 {
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

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int selfDiameter = height(root.left) + height(root.right) + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //2nd approach

    static class Info {
        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),
                leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter, height);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Diameter of the tree: " + diameter(root));
        System.out.println("Diameter of the tree (2nd approach): " + diameter2(root).diameter);
    }
}
