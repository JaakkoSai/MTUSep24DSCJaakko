import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CP3LinkedListTest {

    @Test
    public void testSizeEmptyList() {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();
        assertEquals(0, list.size());  // Expect size 0 for an empty list
    }

    @Test
    public void testSizeNonEmptyList() {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.size());  // Size should be 3
    }
}
