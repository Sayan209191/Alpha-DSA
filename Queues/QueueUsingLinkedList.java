public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head==null & tail==null;
        }

        // add  element 

        public static void add(int data){
            Node newNode=new Node(data);

            if(head==null){    // check queue empty or not
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        // remove element 

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty !!!");
                return -1;
            }

            int front=head.data;
            if(tail==head){
                tail=head=null;
            } else{
                head=head.next;
            }
            return front;
        }

        // peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty !!!");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        // Queue q1=new Queue();
        // q1.add(1);
        // q1.add(2);
        // q1.add(3);

        // while(!q1.isEmpty()){
        //     System.out.println(q1.peek());
        //     q1.remove();
        // }
    }
}
