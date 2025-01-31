import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = "Hello (world)";
        System.out.println(isBalanced(input));
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != '(' && c != ')' && c != '{' && c != '}' && c != '[' && c != ']') {
                continue;
            }// Ignoring all symbols that are not parentheses

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
