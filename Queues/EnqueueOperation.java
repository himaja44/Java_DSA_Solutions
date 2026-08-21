public class EnqueueOperation {

    static int[] queue = new int[5];
    static int rear = -1;

    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        queue[++rear] = value;

        System.out.println(value + " inserted");
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
    }
}