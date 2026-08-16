import java.util.Stack;

public class SearchElementInStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        int key = 30;

        if (stack.search(key) != -1) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}