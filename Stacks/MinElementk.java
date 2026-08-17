import java.util.Stack;

public class MinElementk {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        int min = stack.get(0);

        for (int i = 1; i < stack.size(); i++) {
            if (stack.get(i) < min) {
                min = stack.get(i);
            }
        }

        System.out.println("Minimum Element: " + min);
    }
}