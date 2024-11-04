import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {

    public static void main(String[] args) {
        // Using hashset
        Set<String> names = new HashSet<String>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
        names.add("Kay");

        System.out.println("HashSet implementation");
        for (String n : names) {
            System.out.println(n);
        }
        // Using treeset
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Kay");
        treeSet.add("Jay");
        treeSet.add("May");
        treeSet.add("Fay");
        treeSet.add("Kay");

        System.out.println("TreeSet implementation");
        for (String t : treeSet) {
            System.out.println(t);
        }
    }
}
