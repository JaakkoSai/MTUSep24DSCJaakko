import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BalancedParenthesesCheckerTest {

    @Test
    public void testBalancedExpressions() {
        assertTrue(BalancedParenthesesChecker.isBalanced("( a + b * ( c / ( d - e ) ) ) + ( d / e )"));
        assertTrue(BalancedParenthesesChecker.isBalanced("( a + b * { c / ( d - e )} ) + [ d / e ]"));
        assertTrue(BalancedParenthesesChecker.isBalanced("2 + [5 + 7] + 1"));
        assertTrue(BalancedParenthesesChecker.isBalanced("(2 + [5 + 7] + 1)"));
        assertTrue(BalancedParenthesesChecker.isBalanced("({[<>]})"));
        assertTrue(BalancedParenthesesChecker.isBalanced(""));
    }

    @Test
    public void testUnbalancedExpressions() {
        assertFalse(BalancedParenthesesChecker.isBalanced("2 + [5 + (7 + 3}"));
        assertFalse(BalancedParenthesesChecker.isBalanced("({[<>)})"));
    }

    @Test
    public void testNoParentheses() {
        assertTrue(BalancedParenthesesChecker.isBalanced("a + b * c"));
    }


}
