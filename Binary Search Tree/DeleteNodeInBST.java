public class DeleteNodeInBST {
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
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node delete(Node root,int val) {
        if(root.data > val) {
            root = delete(root.left, val);
        } else if(root.data < val) {
            root = delete(root.right,val);
        } else {
            // Case 1 - Leaf node
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            // case 3 - 2 children

            Node IS = findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
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
        inOrder(root);
        System.out.println();
        delete(root, 5);
        inOrder(root);
    }
}