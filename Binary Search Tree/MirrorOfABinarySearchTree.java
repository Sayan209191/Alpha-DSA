public class MirrorOfABinarySearchTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node mirror(Node root) {
        if(root==null) return null;
        Node leftSub = mirror(root.left);
        Node rightSub = mirror(root.right);
        root.left=rightSub;
        root.right=leftSub;
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);


        /*
                      8                      8     
                    /   \        Mirror     / \
                   5    10     --------->  10  5
                  / \     \               /   / \
                 3   6     11            11  6   3

         */
        System.out.println();
        inOrder(root);
        System.out.println();
        mirror(root);
        inOrder(root);
        System.out.println();
    }
}
