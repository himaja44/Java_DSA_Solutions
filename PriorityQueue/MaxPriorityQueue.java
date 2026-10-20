import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(50);
        pq.add(30);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}