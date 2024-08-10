public class PrintInRange {
    static class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data=data;
            this.left=this.right=null;
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
    
    public static void printInRange(Node root,int k1,int k2) {
        if(root == null) return;
        if(k1 <= root.data && k2 >= root.data) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        } else if(root.data > k2) {
            printInRange(root.left, k1, k2);
        } else {  
            printInRange(root.right, k1, k2);
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

        System.out.println();
        printInRange(root, 5, 12);
        System.out.println();
    }    
}
