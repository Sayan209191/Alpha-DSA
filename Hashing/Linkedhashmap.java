import java.util.LinkedHashMap;
import java.util.HashMap;


public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",150);
        lhm.put("China",130);
        lhm.put("Us",100);
        lhm.put("Indonesia",60);
        lhm.put("Nepal",30);
        lhm.put("Brazil",20);

        HashMap<String , Integer > map = new HashMap<>();
        map.put("India",150);
        map.put("China",130);
        map.put("Us",100);
        map.put("Indonesia",60);
        map.put("Nepal",30);
        map.put("Brazil",20);

        System.out.println(lhm);
        System.out.println(map);
    }

}
