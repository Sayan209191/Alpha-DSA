public class DiameterOfATree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Bruteforce --> O(n^2)
    public static int height(Node root) {
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root) {
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDia = leftHeight+rightHeight+1;
        return Math.max(selfDia ,Math.max(leftDia,rightDia)); 
    }
    
    // Optimize way --> O(n)
    static class Info{
        int diam;
        int ht;
        public Info(int diam , int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diaMeter(Node root) {
        if(root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diaMeter(root.left);
        Info rightInfo = diaMeter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam),
                        leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht , rightInfo.ht)+1;
        return new Info(diam, ht);                
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
        // System.out.println("Diameter of the tree is : "+diameter(root));
        System.out.println("Diameter of the tree is : "+diaMeter(root).diam);
    }
}
