import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciRecursive() {
        assertEquals(0, Fibonacci.fibonacciRecursive(0));  // F(0) = 0
        assertEquals(1, Fibonacci.fibonacciRecursive(1));  // F(1) = 1
        assertEquals(8, Fibonacci.fibonacciRecursive(6));  // F(6) = 8
    }

    @Test
    public void testFibonacciIterative() {
        assertEquals(0, Fibonacci.fibonacciIterative(0));  // F(0) = 0
        assertEquals(1, Fibonacci.fibonacciIterative(1));  // F(1) = 1
        assertEquals(8, Fibonacci.fibonacciIterative(6));  // F(6) = 8
    }
}
