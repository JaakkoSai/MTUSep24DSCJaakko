import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyArraysTest {

    @Test
    public void testSumEmptyArray() {
        int[] values = {};
        assertEquals(0, MyArrays.sum(values));  // Sum of empty array is 0
    }

    @Test
    public void testSumSingleElement() {
        int[] values = {5};
        assertEquals(5, MyArrays.sum(values));  // Sum of single element array is the element itself
    }

    @Test
    public void testSumMultipleElements() {
        int[] values = {1, 2, 3, 4, 5};
        assertEquals(15, MyArrays.sum(values));  // 1 + 2 + 3 + 4 + 5 = 15
    }
}
