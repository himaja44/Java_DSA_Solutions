import java.util.PriorityQueue;

public class SmallestKElements {
    public static void main(String[] args) {
        int[] arr = {15, 3, 20, 8, 1, 12};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
        }

        System.out.println("Smallest " + k + " elements:");

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            System.out.println(pq.poll());
        }
    }
}