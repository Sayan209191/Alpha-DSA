import java.util.ArrayList;
public class MiddleCharacterOfAString {
    public static ArrayList<Character> middleChar(String str){
        ArrayList<Character> ans = new ArrayList<>();
        if(str.length() % 2 == 0){
            ans.add(str.charAt((str.length()/2)-1));
        } 
        ans.add(str.charAt((str.length()/2)));
        return ans;
    }

    public static void main(String[] args) {
        String str = "Sriparna";
        ArrayList<Character> ans = middleChar(str);
        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
