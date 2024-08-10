import java.util.Stack;
public class IterativePostorder {
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
    // Using 2 stack
    public static void iterativePostorder(Node root) {
        if(root==null) return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(! st1.isEmpty()) {
            Node temp = st1.pop();
            st2.push(temp);
            if(temp.left!=null) st1.push(temp.left);
            if(temp.right!=null) st1.push(temp.right);
        }
        while(! st2.isEmpty()) {
            Node curr = st2.pop();
            System.out.print(curr.data + " ");
        }
    }

    // Using Single Stack 

    public static void postOrder(Node root) {
        if(root==null) return;
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(curr != null || !st.isEmpty()) {
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek().right;
                if(temp == null) {
                    temp=st.pop();
                    System.out.print(temp.data + " ");
                    while(!st.isEmpty() && temp==st.peek().right) {
                        temp = st.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    curr = temp;
                }  
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
        // iterativePostorder(root);
        postOrder(root);
    }
}