public class IsQueueEmpty {

    static int front = 0;
    static int rear = -1;

    static void checkEmpty() {

        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is Not Empty");
        }
    }

    public static void main(String[] args) {

        checkEmpty();

        rear = 0;

        checkEmpty();
    }
}