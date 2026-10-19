import java.util.PriorityQueue;

public class PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(5);
        pq.add(15);

        System.out.println("Smallest: " + pq.peek());
        System.out.println("Queue size: " + pq.size());
        System.out.println("Queue: " + pq);
    }
}