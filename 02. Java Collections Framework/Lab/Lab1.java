package Lab;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lab1 {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");


        ListIterator<String> it = names.listIterator();
        it.next();
        it.next();
        it.add("Ray");
    }
}
