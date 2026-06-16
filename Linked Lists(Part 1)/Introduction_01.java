public class Introduction_01 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = new Node(data);
            return;
        }
        
        // step 2 - newNode next = head
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;
    }

    public static void main(String args[]) {
        Introduction_01 ll = new Introduction_01();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
