

public class Detecting_Cycle_01 {
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

    // Floyd's Tortoise and Hare Algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    //Removing cycle from the linked list
    public static void removeCycle() {
        //Detecting cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //Finding meeting point
        slow = head;
        Node prev = null; 
        while(slow != fast) {
            prev = fast; 
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle 
        if (prev == null) { // cycle starts at head
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        } else {
            prev.next = null;
        }


    }
    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = head; 
        //1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
