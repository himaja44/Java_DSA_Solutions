
import java.util.ArrayDeque;
import java.util.Deque;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                deque.addLast(i);
            }

            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            if (i >= k - 1) {
                if (deque.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[deque.peekFirst()] + " ");
                }
            }
        }
    }
}
