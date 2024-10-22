import java.util.LinkedList;
import java.util.ListIterator;

public class Q1 {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> it = names.listIterator();
        it.next();
        it.next();
        it.next();
        it.add("Ray");
        it.previous();
        it.previous();
        it.remove();

        it = names.listIterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        while (it.hasPrevious()) {
            String name2 = it.previous();
            System.out.println(name2);
        }

        names.add("Kay");

        for (String n : names) {
            System.out.println(n);
        }

    }
}
