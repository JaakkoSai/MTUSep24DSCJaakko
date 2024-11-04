import java.util.NoSuchElementException;

// Singly linked list with first reference only

/**
 * A linked list is a sequence of links with efficient
 * element insertion and removal. This class contains a subset
 * of the methods of the standard java.util.LinkedList class.
 */

public class CP3LinkedList<E> {
    private class Node {
        public E data;
        public Node next;
    }

    private Node first;

    /**
     * Constructs an empty linked list.
     */
    public CP3LinkedList() {
        first = null;
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
        return element;
    }

    /**
     * Iterative version of print method.
     * Outputs the data on the list.
     */
    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * Recursive version of size method.
     * @return the size of the linked list
     */
    public int size() {
        return sizeSub(first);
    }

    private int sizeSub(Node head) {
        if (head == null) return 0;  // Base case: empty list
        return 1 + sizeSub(head.next);  // Recursive call
    }

    /**
     * Recursive version of print method.
     */
    public void printRecursive() {
        printSub(first);
    }

    private void printSub(Node head) {
        if (head == null) return;  // Base case: no more nodes
        System.out.println(head.data);
        printSub(head.next);  // Recursive call
    }

    /**
     * Recursive version of print method to print in reverse order.
     */
    public void printReverse() {
        printSubReverse(first);
    }

    private void printSubReverse(Node head) {
        if (head == null) return;  // Base case: no more nodes
        printSubReverse(head.next);  // Recursive call
        System.out.println(head.data);  // Print after recursive call
    }
}
