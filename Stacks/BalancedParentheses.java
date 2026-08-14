import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        String expression = "{[()]}";

        Stack<Character> stack = new Stack<>();

        boolean balanced = true;

        for (char ch : expression.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {

                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced)
            System.out.println("Balanced Parentheses");
        else
            System.out.println("Not Balanced");
    }
}