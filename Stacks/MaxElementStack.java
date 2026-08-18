import java.util.Stack;

public class MaxElementStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        int max = stack.get(0);

        for (int i = 1; i < stack.size(); i++) {
            if (stack.get(i) > max) {
                max = stack.get(i);
            }
        }

        System.out.println("Maximum Element: " + max);
    }
}