import java.util.Collections;
import java.util.PriorityQueue;

public class FindKLargest {
    public static void main(String[] args) {
        int[] arr = {12, 5, 30, 8, 25, 40};
        int k = 3;

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.add(num);
        }

        System.out.println(k + " largest elements:");

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            System.out.println(pq.poll());
        }
    }
}