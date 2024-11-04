import java.util.Deque;
import java.util.LinkedList;

public class BalancedParenthesesChecker {

    public static boolean isBalanced(String expression) {
        // Create an empty stack of characters using LinkedList as Deque
        Deque<Character> stack = new LinkedList<>();
        boolean balanced = true;
        int index = 0;

        while (balanced && index < expression.length()) {
            char ch = expression.charAt(index);

            if (isOpen(ch)) {
                stack.push(ch); // Push opening parenthesis onto the stack
            } else if (isClose(ch)) {
                if (stack.isEmpty()) {
                    balanced = false;
                } else {
                    char topChar = stack.pop(); // Pop the top item from the stack
                    if (!areMatching(topChar, ch)) {
                        balanced = false;
                    }
                }
            }
            index++;
        }

        return balanced && stack.isEmpty();
    }

    private static boolean isOpen(char ch) {
        return ch == '(' || ch == '{' || ch == '[' || ch == '<';
    }

    private static boolean isClose(char ch) {
        return ch == ')' || ch == '}' || ch == ']' || ch == '>';
    }

    private static boolean areMatching(char c1, char c2) {
        return (c1 == '(' && c2 == ')') ||
                (c1 == '{' && c2 == '}') ||
                (c1 == '[' && c2 == ']') ||
                (c1 == '<' && c2 == '>');
    }

    public static void main(String[] args) {
        // Test cases to check various scenarios
        String[] testExpressions = {
                "( a + b * ( c / ( d - e ) ) ) + ( d / e )", // Balanced
                "( a + b * { c / ( d - e )} ) + [ d / e ]", // Balanced
                "2 + [5 + 7] + 1", // Balanced
                "2 + [5 + (7 + 3}", // Unbalanced
                "(2 + [5 + 7] + 1)", // Balanced
                "({[<>]})", // Balanced
                "({[<>)})", // Unbalanced
                "a + b * c", // No parentheses, should be balanced
                "", // Empty expression, should be balanced
        };

        for (String expression : testExpressions) {
            System.out.println("Expression: " + expression);
            System.out.println("Is balanced? " + isBalanced(expression));
            System.out.println();
        }
    }
}
