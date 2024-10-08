public class StackUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }

        // Push 
        public void push(int data){
            Node newNode=new Node(data);

            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        // Pop 
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        // Peek 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data; 
        }
    }
    public static void main(String[] args) {
        Stack S=new Stack();
        S.push(1);
        S.push(2);
        S.push(3);

        while(! Stack.isEmpty()){
            System.out.println(S.pop());
        }
    }
}
