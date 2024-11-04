import java.util.NoSuchElementException;

public class CP3LinkedList<E> {
    private class Node {
        public E data;
        public Node next;
        public Node prev; // New property for previous node
    }

    private Node first;
    private Node last;

    public CP3LinkedList() {
        first = null;
        last = null;
    }

    public void addFirst(E element) {
        Node newLink = new Node();
        newLink.data = element;
        newLink.next = first;
        newLink.prev = null;
        if (first != null) {
            first.prev = newLink;
        }
        first = newLink;
        if (last == null) {
            last = first;
        }
    }

    public void addLast(E element) {
        Node newLink = new Node();
        newLink.data = element;
        newLink.next = null;
        newLink.prev = last;
        if (last != null) {
            last.next = newLink;
        }
        last = newLink;
        if (first == null) {
            first = last;
        }
    }

    public E removeFirst() {
        if (first == null) throw new NoSuchElementException();
        E element = first.data;
        first = first.next;
        if (first != null) {
            first.prev = null;
        } else {
            last = null;
        }
        return element;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Unit testing for doubly linked list
    public static void main(String[] args) {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Doubly Linked List:");
        list.print(); // Should print 20, 10, 30, 40
    }
}
