import java.util.*;

public class startswith_problem_04 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false; //eow = end of word

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int level = 0; level < prefix.length(); level++) {
            int idx = prefix.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(startsWith("app")); // true
        System.out.println(startsWith("moon")); // false
        System.out.println(startsWith("wom")); // true
    }

}
