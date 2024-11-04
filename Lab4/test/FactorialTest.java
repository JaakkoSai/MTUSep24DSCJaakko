import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));  // Base case
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Factorial.factorial(1));  // Base case
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, Factorial.factorial(5));  // 5! = 120
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(3628800, Factorial.factorial(10));  // 10! = 3628800
    }
}
