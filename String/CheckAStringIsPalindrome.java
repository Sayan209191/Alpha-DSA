public class CheckAStringIsPalindrome {
    public static boolean isPalindrome(String str) {
        int mid=str.length()/2;
        for(int i=0;i<=mid;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name="racecarq";
        System.out.print(isPalindrome(name));
    }
}
