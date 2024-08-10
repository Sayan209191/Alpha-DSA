public class RemoveDuplicateInAString {
    // RemoveDuplicateInAString   (Google , Microsoft)
    // Simple question , all characters ---> using Hashsheet
    // Condition ---> (a -> z)
    public static void removeDuplicate(String str,int idx, StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr.toString());
            System.out.println(newstr.toString().length());
            return;
        }
        // main logic
        char ch=str.charAt(idx); // Current character
        if(map[ch-'a']== true){   // contain duplicate characters
           removeDuplicate(str, idx+1, newstr, map); 
        }
        else{
            map[ch-'a']= true;
            newstr.append(ch);
            removeDuplicate(str, idx+1, newstr, map);
        }
    }
    public static void main(String[] args) {
        String str="umbreala";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
