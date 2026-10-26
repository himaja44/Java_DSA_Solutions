import java.util.PriorityQueue;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9};
        int[] arr2 = {2, 4, 8};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr1) {
            pq.offer(num);
        }

        for (int num : arr2) {
            pq.offer(num);
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}