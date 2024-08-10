import java.util.*;

public class WorldBreakProblem {  // Google

    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    } 
    public static Node root = new Node();

    public static void insert(String s) {   // O(L)
        Node curr = root;
        for(int level = 0; level < s.length(); level++ ) {
            int idx = s.charAt(level)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;

    }

    public static boolean search(String s) {
        Node curr = root;
        for(int i=0; i<s.length(); i++) {
            int idx = s.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        if(curr.eow == true) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isWordBreak(String words[],String key)  {
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        return wordBreak(key);
    }

    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }

        for(int i=1; i<=key.length(); i++) {
            if(search(key.substring(0, i)) 
               && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    // GFG : https://www.geeksforgeeks.org/problems/word-break1352/1
    
    public static int wordBreak(String A, ArrayList<String> B ) {
        //code here
        int n = A.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && B.contains(A.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        if(dp[n] == true) return 1;
        return 0;
    }
    public static void main(String[] args) {
        String words[] = {"i","like","sam","samsung","ice","mobile"};
        String key = "ilikesamsung";

        System.out.println(isWordBreak(words, key));
    }
}
