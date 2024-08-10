import java.util.Comparator;
import java.util.PriorityQueue; 

public class ObjectStoringInPq {
    static class Student implements Comparable<Student>{
        String Name;
        int rank;
        public Student(String name, int rank) {
            this.Name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 17));
        pq.add(new Student("C", 1));

        while(! pq.isEmpty()) {
            System.out.println(pq.peek().Name+ "---> "+pq.peek().rank);
            pq.remove();
        }
    }
}
