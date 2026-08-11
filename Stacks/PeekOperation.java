public class PeekOperation {

    static int[] stack = new int[5];
    static int top = -1;

    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + stack[top]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        peek();
    }
}