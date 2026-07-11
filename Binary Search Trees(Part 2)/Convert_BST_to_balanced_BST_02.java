import java.util.*;

public class Convert_BST_to_balanced_BST_02 {
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
    public static void preorder(Node root) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }
        
        System.out.print(root.data + " ");
        preorder(root.left); // Traverse the left subtree
        preorder(root.right); // Traverse the right subtree
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return; 
        }
        
        getInorder(root.left, inorder); 
        inorder.add(root.data); 
        getInorder(root.right, inorder); 
    }

    public static Node createBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) {
            return null; 
        }

        int mid = (start + end) / 2; 
        Node node = new Node(inorder.get(mid)); 

        node.left = createBST(inorder, start, mid - 1);
        node.right = createBST(inorder, mid + 1, end);
        return node; 
    }

    public static Node balancedBST(Node root) {
        //inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //sorted inorder sequence to balanced BST
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        preorder(root);

    }
}
