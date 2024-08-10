import java.util.*;
public class TopViewOfABinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info {
        int hd;
        Node node;
        public Info(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topView(Node root) {
        // Level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0; i<n; i++) {
                Info curr = q.remove();
                Node currNode = curr.node;
                int hd = curr.hd;

                if(!map.containsKey(hd)) {
                    map.put(hd, currNode);
                }

                if(currNode.left != null) {
                    q.add(new Info(currNode.left, hd-1));
                    min = Math.min(min, hd-1);
                }
                if(currNode.right != null) {
                    q.add(new Info(currNode.right, hd+1));
                    max = Math.max(max, hd+1);
                }

            }
        }

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
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
        topView(root);
    }    
}
