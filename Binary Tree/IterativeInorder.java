import java.util.Stack;
public class IterativeInorder {
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
    public static void iterativeInorder(Node root) {
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while(true) {
            if(temp != null) {
                st.push(temp);
                temp=temp.left;
            } else {
                if(st.isEmpty()) break;
                temp = st.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
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
        iterativeInorder(root);
    }
}
