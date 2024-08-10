import java.util.*;


public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(9);
        set.add(1);
        set.add(3);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(2));

        System.out.println(set.isEmpty());

        set.remove(1);

        System.out.println(set.contains(1));

        // set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

        // Iteration on HashSet

        // Iterator it = set.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // Advance for loop

        for (Integer i : set) {
            System.out.println(i);
        }
        
        
    }
}
