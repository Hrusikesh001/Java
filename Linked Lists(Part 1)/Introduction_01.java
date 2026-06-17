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
    public static int size;


    public static void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = new Node(data);
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head;
        // step 3 - head = newNode
        head = newNode;
    }
    public static void addLast(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = new Node(data);
            return;
        }
        // step 2 - tail next = newNode
        tail.next = newNode;
        // step 3 - tail = newNode
        tail = newNode;
    }

    public static void print() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add in the middle
    public void add(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]) {
        Introduction_01 ll = new Introduction_01();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        System.out.println(ll.size);
    }
}
