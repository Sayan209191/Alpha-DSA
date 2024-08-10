import java.util.ArrayList;
public class BSTToBalanceBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    public static void preOrder( Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrderTraversal(Node root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }
    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        return list;
    }

    public static Node balanceBST(ArrayList<Integer> list,int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start+end) / 2;
        Node root = new Node(list.get(mid));
        root.left = balanceBST(list, start, mid-1);
        root.right = balanceBST(list, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
                   8                             8
                  / \                           /  \
                 6  10       Balanced          5    11
                /     \      ------->         / \   / \
               5      11                     3   6 10  12
              /         \
             3          12 
         */

        ArrayList<Integer> list = inOrder(root);
        Node new_root = balanceBST(list, 0, list.size()-1);
        preOrder(new_root);
        
    }
}
