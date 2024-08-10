public class Tries {
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
    public static void main(String[] args) {
        String words[] = {"there","a","their","any","thee"};

        // insert

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        // Search

        System.out.println(search("the"));
    }
}