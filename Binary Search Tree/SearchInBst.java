public class SearchInBst {
    static class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val) {
        if(root == null) {
            return new Node(val);
        }
        if(val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    public static Node createBst(Node root,int values[]) {
        for(int i=0;i<values.length;i++) {
            root=insert(root, values[i]);
        }
        return root;
    }
    
    public static boolean search(Node root,int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        // search in left subtree
        if(key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values[] = {8,5,6,3,1,4,10,11,14};
        Node root = null;
        root= createBst(root, values);
        /*
                      8
                    /   \
                   5    10
                  / \     \
                 3   6     11
                / \         \
               1   4        14
         */
        if(search(root, 6)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
