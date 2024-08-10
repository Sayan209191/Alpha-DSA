import java.util.HashMap;
import java.util.TreeMap;

public class TreeHashMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",150);
        tm.put("China",130);
        tm.put("Us",100);
        tm.put("Indonesia",60);
        tm.put("Nepal",30);
        tm.put("Brazil",20);

        HashMap<String , Integer > map = new HashMap<>();
        map.put("India",150);
        map.put("China",130);
        map.put("Us",100);
        map.put("Indonesia",60);
        map.put("Nepal",30);
        map.put("Brazil",20);

        System.out.println(tm);
        System.out.println(map);
    }
}
