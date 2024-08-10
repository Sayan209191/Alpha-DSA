import java.util.HashMap;

public class FindItineraryOfTickets {

    // Using 2 hashmap

    public static String itnString(String str[][]) {  // Tc - > O(n), Sc - > O(n+n)
        HashMap<String, String> map = new HashMap<>();
        HashMap<String,String> revMap = new HashMap<>();
        StringBuffer sb = new StringBuffer("");

        for (int i = 0; i < str.length; i++) {
            map.put(str[i][0], str[i][1]);
        }

        for (String key : map.keySet()) {
            revMap.put(map.get(key),key);
        }
        String start = "";
        for (String key : map.keySet()) {
            if(!revMap.containsKey(key)) {
                start = key;
            }
        }
        revMap.clear();
        sb.append(start);
        while (map.containsKey(start)) {
            String nextCity = map.get(start);
            sb.append(" -> "+nextCity );
            map.remove(start);
            start = nextCity;
        }

        return sb.toString();

    }

    // Using Single HashMap
    public static String itneString(String str[][]) { //Tc - > O(n), Sc - > O(n)
        HashMap<String, String> map = new HashMap<>();
        StringBuffer sb = new StringBuffer("");

        for (int i = 0; i < str.length; i++) {
            map.put(str[i][0], str[i][1]);
        }

        String start = "";
        for (String key : map.keySet()) {
            if (!map.containsValue(key)) {
                start = key;
                break;
            }
        }

        sb.append(start);
        while (map.containsKey(start)) {
            String nextCity = map.get(start);
            sb.append(" -> "+nextCity );
            map.remove(start);
            start = nextCity;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String tickets[][] = {{"Chennai", "Bengaluru"},
                              {"Mumbai", "Delhi"},
                              {"Goa", "Chennai"},
                              {"Delhi", "Goa"}
        };

        System.out.println(itneString(tickets));
        System.out.println(itnString(tickets));
    }
}

