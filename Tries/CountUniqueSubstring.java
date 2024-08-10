public class CountUniqueSubstring {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
         
        public Node(){
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String s) {
        Node curr = root;
        for(int i=0; i<s.length(); i++) {
            int idx = s.charAt(i)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static int countNode(Node root) {

        if(root == null) {
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++ ) {
            if(root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count+1;
    }

    public static int totalUniqueSubString(String str) {

        // Find all suffix + create a trie of all suffix

        for(int i=0; i<str.length(); i++) {
            String subStr = str.substring(i);

            insert(subStr);
        }

        return countNode(root);
    }

    public static void main(String[] args) {
        String str = "apple";

        System.out.println(totalUniqueSubString(str));
    }
}
