import java.util.HashMap;

public class ValidAnagram {

    public static boolean isValid(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        } else{
            HashMap<Character,Integer> map = new HashMap<>();
            // Step 1 -> Add character of string s and their freq in map  
            for(int i=0; i<s.length(); i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
            }

            // Step 2 -> traverse in string t
            for(int i=0; i<t.length(); i++) {
                char ch = t.charAt(i);
                if(map.containsKey(ch)) {
                    if(map.get(ch) == 1) {
                        map.remove(ch);
                    } else {
                        map.put(ch,map.get(ch)-1);
                    }
                } else {
                    return false;
                }
            }  
        
            // step 3 --> check map is empty or not
            if(map.isEmpty()) {
                return true;
            } else {
                return false;
            }    
        }

    }
    public static void main(String[] args) {
        String s = "keen";
        String t = "neek";

        System.out.println(isValid(s, t));
    }
}
