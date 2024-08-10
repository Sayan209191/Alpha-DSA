import java.util.*;

public class LinkedHashSetAndTreeSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Kolkata");
        set.add("Bengaluru");
        set.add("Noida");
        set.add("Hydrabad");

        System.out.println(set);

        // Linked Hash Set   --> Followed insertion order

        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Kolkata");
        lhs.add("Bengaluru");
        lhs.add("Noida");
        lhs.add("Hydrabad");

        System.out.println(lhs);

        // Tree set --> assending order sorted

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Kolkata");
        ts.add("Bengaluru");
        ts.add("Noida");
        ts.add("Hydrabad");

        System.out.println(ts);

    }
}
