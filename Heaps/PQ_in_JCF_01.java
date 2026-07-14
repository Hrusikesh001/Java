import java.util.PriorityQueue;
public class PQ_in_JCF_01 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(java.util.Collections.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
