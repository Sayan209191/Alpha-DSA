public class CreateABST {
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
        if(val < root.data) {
            // left Subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node createBst(Node root,int values[]) {
        for(int i=0;i<values.length;i++) {
            root=insert(root, values[i]);
        }
        return root;
    }
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        root= createBst(root, values);
        inOrder(root);
        System.out.println();
    }
}