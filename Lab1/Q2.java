import java.util.HashSet;
import java.util.Set;

public class Q2 {

    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
        names.add("Kay");

        for (String n : names) {
            System.out.println(n);
        }
    }
}
