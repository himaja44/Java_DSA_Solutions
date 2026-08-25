public class QueueSize {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {
        if (rear < queue.length - 1) {
            queue[++rear] = value;
        }
    }

    static void displaySize() {

        int size = rear - front + 1;

        System.out.println("Queue Size: " + size);
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        displaySize();
    }
}