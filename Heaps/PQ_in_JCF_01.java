import java.util.PriorityQueue;
public class PQ_in_JCF_01 {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(java.util.Collections.reverseOrder());
        pq.add(new Student("Alice", 3));
        pq.add(new Student("Bob", 4));
        pq.add(new Student("Charlie", 1));
        pq.add(new Student("David", 7));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}
