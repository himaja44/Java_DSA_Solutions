import java.util.PriorityQueue;
import java.util.Collections;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 50, 30};
        int k = 3;

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.offer(num);
        }

        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        System.out.println("Kth largest: " + pq.peek());
    }
}