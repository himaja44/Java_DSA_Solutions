public class StackUsingArray {

    static int[] stack = new int[5];
    static int top = -1;

    static void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    static void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();
    }
}