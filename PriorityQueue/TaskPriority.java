import java.util.PriorityQueue;

public class TaskPriority {
    public static void main(String[] args) {
        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        tasks.offer(3);
        tasks.offer(1);
        tasks.offer(4);
        tasks.offer(2);

        while (!tasks.isEmpty()) {
            int task = tasks.poll();
            System.out.println("Processing task: " + task);
        }
    }
}