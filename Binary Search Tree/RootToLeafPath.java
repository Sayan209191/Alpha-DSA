import java.util.ArrayList;
public class RootToLeafPath {
    static class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data=data;
            this.left=this.right=null;
        }
    }

    public static void printPath(ArrayList<Integer>path) {
        for(int i=0;i<path.size();i++) {
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }

    public static void rootToLeaf(Node root,ArrayList<Integer>path) {
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);

        /*
                      8
                    /   \
                   5    10
                  / \     \
                 3   6     11

         */

        // System.out.println();
        rootToLeaf(root, new ArrayList<>());
        // System.out.println();
    }   
}
