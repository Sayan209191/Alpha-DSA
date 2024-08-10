import java.util.HashMap;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {

        // Create
        HashMap<String , Integer > map = new HashMap<>();

        // Insert  -> O(1)
        map.put("India",150);
        map.put("China",130);
        map.put("Us",100);
        map.put("Indonesia",60);
        map.put("Nepal",30);
        map.put("Brazil",20);

        // System.out.println(map);

        // Get --> O(1)
        System.out.println(map.get("India"));
        System.out.println(map.get("Uk"));

        // ContainsKey --> O(1)

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Uk"));


        // Remove

        System.out.println(map.remove("China"));
        System.out.println(map);

        // Iteration on HashMap

        Set<String> keys = map.keySet();

        for (String k : keys) {
            System.out.println("Key = "+k+" , Value = "+map.get(k));
        }
    }
}