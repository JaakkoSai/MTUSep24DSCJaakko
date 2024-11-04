import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of links with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
 */
public class CP3LinkedList<E> {
    private class Node {
        public E data;
        public Node next;
    }

    private Node first;
    private Node last; // New property to keep track of the last node

    /**
     * Constructs an empty linked list.
     */
    public CP3LinkedList() {
        first = null;
        last = null; // Initialize last to null
    }

    /**
     * Adds an element to the front of the linked list.
     * @param element the element to add
     */
    public void addFirst(E element) {
        Node newLink = new Node();
        newLink.data = element;
        newLink.next = first;
        first = newLink;
        if (last == null) { // If the list was empty, update last
            last = first;
        }
    }

    public E getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public E removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        E element = first.data;
        first = first.next;
        if (first == null) { // If the list becomes empty, update last
            last = null;
        }
        return element;
    }

    /**
     * Prints all elements in the linked list.
     */
    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * Calculates the size of the linked list.
     * @return the size of the list
     */
    public int size() {
        int count = 0;
        Node current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Checks if the list contains a particular value.
     * @param element the value to search for
     * @return true if the value is in the list, false otherwise
     */
    public boolean contains(E element) {
        Node current = first;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Adds an element to the end of the linked list.
     * @param element the element to add
     */
    public void addLast(E element) {
        Node newLink = new Node();
        newLink.data = element;
        newLink.next = null;
        if (last == null) { // If the list is empty, update both first and last
            first = newLink;
            last = newLink;
        } else {
            last.next = newLink;
            last = newLink;
        }
    }

    // Main method for unit testing
    public static void main(String[] args) {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();

        // Testing addFirst, addLast, and size methods
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Size of the list: " + list.size()); // Should print 4
        list.print(); // Should print 20, 10, 30, 40

        // Testing contains method
        System.out.println("List contains 10: " + list.contains(10)); // Should print true
        System.out.println("List contains 50: " + list.contains(50)); // Should print false

        // Testing removeFirst
        System.out.println("Removed element: " + list.removeFirst()); // Should print 20
        System.out.println("Size of the list after removal: " + list.size()); // Should print 3
        list.print(); // Should print 10, 30, 40
    }
}
