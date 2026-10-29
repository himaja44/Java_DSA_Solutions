
import java.util.ArrayDeque;
import java.util.Deque;

public class InsertRemoveDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Original: " + deque);

        deque.addFirst(5);
        deque.addLast(40);
        System.out.println("After insertion: " + deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removal: " + deque);
    }
}
