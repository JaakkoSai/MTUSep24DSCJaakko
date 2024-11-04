import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearchFound() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));  // 3 is at index 2
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 6));  // 6 is not in the array
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 1));  // Array is empty
    }
}
