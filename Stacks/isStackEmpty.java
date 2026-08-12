public class IsStackEmpty {

    static int top = -1;

    static void checkEmpty() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }

    public static void main(String[] args) {

        checkEmpty();

        top = 0;

        checkEmpty();
    }
}