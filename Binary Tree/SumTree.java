public class SumTree {
    // transform sum tree
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int transform(Node root){
        if(root == null) {
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);
        int data=root.data;
        int newLeft;
        int newright;
        if(root.left==null) {
            newLeft=0;
        } else{
            newLeft=root.left.data;
        }
        if(root.right==null) {
            newright=0;
        } else {
            newright=root.right.data;
        }
        root.data=leftChild+newLeft+rightChild+newright;
        return data;
    }
    public static void main(String[] args) {
        /*
             1     
            / \
           2   3   
          / \ / \
         4  5 6   7 
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        transform(root);
        preOrder(root);
    }
}
