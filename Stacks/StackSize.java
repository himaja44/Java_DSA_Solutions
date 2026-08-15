import java.util.Stack;

public class StackSize {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);
        System.out.println("Stack Size: " + stack.size());
    }
}