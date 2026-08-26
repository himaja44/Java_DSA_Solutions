public class DisplayQueue {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {
        queue[++rear] = value;
    }

    static void display() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue Elements:");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();
    }
}