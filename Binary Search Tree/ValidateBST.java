import java.util.ArrayList;
public class ValidateBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }
    
    // Approch 1 : - use InOrder traveral --> Tc - O(n) , Sc - O(n) 

    public static boolean isSorted(ArrayList<Integer> elements) {
        int count=0;
        for(int i=0 ; i < elements.size()-1; i++ ){
            if(elements.get(i) <= elements.get(i+1)) {
                count++;
            }
        }
        if(count == elements.size()-1) {
            return true;
        } else{
            return false;
        }
    }
    public static void inOrderTraversal(Node root, ArrayList<Integer> list){
        if(root == null) return;
        inOrderTraversal(root.left, list);
        list.add(root.data);
        inOrderTraversal(root.right, list);
    }    
    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        inOrderTraversal(root, list);
        return list;
    }
    public static boolean isValidate(Node root) {
        ArrayList<Integer>list = inOrder(root);
        if(isSorted(list)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidateBST(Node root,Node min,Node max) {
        if(root == null) return true;
        if(min != null && root.data <= min.data) {
            return false;
        } else if(max != null && root.data >= max.data) {
            return false;
        }
        return isValidateBST(root.left,min,root) && isValidateBST(root.right,root,max);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        // Node root=new Node(1);
        // root.left=new Node(1);
        // root.right=new Node(1);


        /*
                      8
                    /   \
                   5    10
                  / \     \
                 3   6     11

         */
        System.out.println();
        // if(isValidate(root)) {
        //     System.out.println("Tree is Valid Binary Search Tree");
        // } else {
        //     System.out.println("Invalid");
        // }
        if(isValidateBST(root,null,null)) {
            System.out.println("Tree is Valid Binary Search Tree");
        } else {
            System.out.println("Invalid");
        }
        System.out.println();
    }     
}
