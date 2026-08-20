public class QueueUsingArray {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        queue[rear] = value;
    }

    static void display() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue Elements:");

        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();
    }
}