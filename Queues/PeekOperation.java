public class PeekOperation {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void enqueue(int value) {
        queue[++rear] = value;
    }

    static void peek() {

        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        peek();
    }
}