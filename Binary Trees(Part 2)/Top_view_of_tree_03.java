import java.util.*;
public class Top_view_of_tree_03 {
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
    static class Pair {
        Node node;
        int hd;

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root) {
        //Level order
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        int min = 0, max = 0;
        q.add(new Pair(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    continue;
                }
            }
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }
            if (curr.node.left != null) {
                q.add(new Pair(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            if (curr.node.right != null) {
                q.add(new Pair(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top view of the binary tree:");
        topView(root);
    }
}
