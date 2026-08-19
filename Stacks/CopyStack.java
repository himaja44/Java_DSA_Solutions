import java.util.Stack;

public class CopyStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        Stack<Integer> copy = new Stack<>();

        copy.addAll(stack);

        System.out.println("Original Stack: " + stack);
        System.out.println("Copied Stack: " + copy);
    }
}