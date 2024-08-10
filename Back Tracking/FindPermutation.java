public class FindPermutation {
    public static void findPermutation(String str, String ans) {
        // Base Case :
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // abcde --> "ab"+"de"
            String new_str = str.substring(0, i) + str.substring(i + 1);
            findPermutation(new_str, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
