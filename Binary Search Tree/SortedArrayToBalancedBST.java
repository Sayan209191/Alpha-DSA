public class SortedArrayToBalancedBST {
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
    public static Node createBalancedBST(int arr[], int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBalancedBST(arr, start, mid-1);
        root.right = createBalancedBST(arr, mid+1, end);
        return root;
    }
    public static void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        int numbers[] = {3, 5, 6, 8, 10, 11, 12};
        /*
                      8
                    /   \
                   5     10
                  / \   /  \
                 3   6  11  12

        */

        Node root = createBalancedBST(numbers, 0, numbers.length-1);
        inOrderTraversal(root);
    }
}
