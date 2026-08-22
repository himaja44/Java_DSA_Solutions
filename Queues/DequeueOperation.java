public class DequeueOperation {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        queue[++rear] = value;
    }

    static void dequeue() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted Element: " + queue[front]);

        front++;
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        dequeue();
        dequeue();
    }
}