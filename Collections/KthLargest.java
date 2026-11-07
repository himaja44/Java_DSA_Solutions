
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 50, 30};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(k + "th largest: " + pq.peek());
    }
}
