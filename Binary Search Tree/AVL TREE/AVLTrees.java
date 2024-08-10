public class AVLTrees {

    static class Node {
        int data, hight;
        Node left, right;
        Node(int data) {
            this.data=data;
            hight=1;
        }
    }
    public static Node root;

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        return root.hight;
    }

    static int max(int a,int b) {
        return a>b ? a:b;
    }

    // Right Rotate Subtree rotated with y

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform Rotation
        x.right = y;
        y.left = T2;

        // Update HighLights

        x.hight = max(height(x.left), height(x.right))+1;
        y.hight = max(height(y.left), height(y.right))+1;

        // Return New root

        return x;

    }

    // Left rotate subtree rotated with x 

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation 

        y.left = x;
        x.right = T2;

        // Update HighLights

        x.hight = max(height(x.left), height(x.right))+1;
        y.hight = max(height(y.left), height(y.right))+1;

        // Return New root

        return y;
    }

    // Get Balanced Factor of Node

    public static int getBalance(Node root) {
        if(root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root,int key) {
        if(root == null) {
            return new Node(key);
        }
        if(key < root.data) {
            root.left = insert(root.left, key);
        } else if(key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;    // Duplicate Node not allowed
        }

        // Update root hight

        root.hight=1 + Math.max(height(root.left),height(root.right));

        // Get root's Balance factor

        int bf = getBalance(root);

        // Left Left Case

        if(bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case 

        if(bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left right Case

        if(bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root); 
        }

        // Right Left Case

        if(bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        // Well Balanced AVL

        return root;

    }

    // PreOrder Traversal

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // Nodes --> 40,20,10,25,30,22,50

        /* 
                Balanced AVL tree
                     25
                    /   \
                   20    40
                  /  \   / \
                 10  22 30 50 
         */

        root = insert(root, 40);
        root = insert(root, 20);
        root = insert(root, 10);
        root = insert(root, 25);
        root = insert(root, 30);
        root = insert(root, 22);
        root = insert(root, 50);
        preOrder(root); 
    }
}
