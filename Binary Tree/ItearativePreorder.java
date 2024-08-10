import java.util.Stack;
public class ItearativePreorder {
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
    public static void iterativePreorder(Node root) {
        Stack<Node> st = new Stack<>();
        if(root == null) {
            return;
        }
        st.push(root);
        while(! st.isEmpty()) {
            Node currNode=st.pop();
            System.out.print(currNode.data+" ");
            if(currNode.right!=null) {
                st.push(currNode.right);
            }
            if(currNode.left != null) {
                st.push(currNode.left);
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
        iterativePreorder(root);
    }
}
