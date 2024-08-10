public class DoublyLinkedList {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add ---> add first

    public void addFirst(int e) {
        Node newNode=new Node(e);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;

        head=newNode;
    }

    // add last

    public void addLast(int e){
        Node newNode=new Node(e);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    // Remove first

    public void removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty!!!!");
        } else if(size==1){
            head=tail=null;
            size=0;
        } 

        head=head.next;
        head.prev=null;
        size--;
    }

    // remove last

    public void removeLast(){
        if(size==0){
            System.out.println("Linked List is empty!!!!");
        } else if(size==1){
            head=tail=null;
            size=0;
        }

        tail=tail.prev;
        tail.next=null;
        size--;
    }

    // Print 
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // reverse a doubly linked list

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
    
            prev = curr;
            curr = next;
        }
    
        head = prev;
    }
    
    
    

    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // dll.addLast(4);
        // dll.print();

        // dll.removeFirst();
        // dll.print();

        // dll.removeLast();
        // dll.print();

        dll.reverse();
        dll.print();
    }
}
