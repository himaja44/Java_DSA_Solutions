public class CircularEnqueue {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;

        System.out.println(value + " inserted");
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
    }
}