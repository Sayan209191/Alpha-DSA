import java.util.ArrayList;
public class MergeTwoBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return ;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        ArrayList<Integer> mergeAL = new ArrayList<>();
        int i=0,j=0;
        while(i < arr1.size() && j < arr2.size()) {
            if(arr1.get(i) < arr2.get(j)) {
                mergeAL.add(arr1.get(i));
                i++;
            } else {
                mergeAL.add(arr2.get(j));
                j++;
            }
        }
        while(i < arr1.size()){
            mergeAL.add(arr1.get(i));
            i++;
        }
        while(j < arr2.size()){
            mergeAL.add(arr2.get(j));
            j++;
        }
        return mergeAL;
    }
    public static Node createBalancedBST(ArrayList<Integer> arr, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBalancedBST(arr, start, mid-1);
        root.right = createBalancedBST(arr, mid+1, end);
        return root;
    }
    public static Node mergeBST(Node root1, Node root2) {

        // step 1 -> Inorder sequence of BST1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // step 2 -> Inorder sequence of BST2

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // step 3 -> merge two arraylist
        ArrayList<Integer> mergeArr = merge(arr1, arr2);

        // step 4 -> sorted arr --> BST
        return createBalancedBST(mergeArr, 0, mergeArr.size()-1);

    }
    public static void inorderSequence(Node root) {
        if(root == null) {
            return;
        }
        inorderSequence(root.left);
        System.out.print(root.data+" ");
        inorderSequence(root.right);
    }
    public static void main(String[] args) {
        /*
              2
             / \
            1   4
             BST1 
         */
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        /*
            9
           / \
          3  12
           BST2
         */

        Node root1 = new Node(9);
        root1.left = new Node(3);
        root1.right = new Node(12);
        Node finalRoot = mergeBST(root, root1);
        /*
                 3
               /   \
              1     9
               \   / \
                2  4  12
          Merge Binary Search Tree

         */
        inorderSequence(finalRoot);
    }
}
