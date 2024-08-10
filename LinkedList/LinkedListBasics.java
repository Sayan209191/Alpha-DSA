public class LinkedListBasics{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    // Add element in linked list ---> 
    // 1. add first
    // 2. add last
    // 3. add any intermediate position
    public void addFirst(int data){
        // step 1 :- create new node
        Node newNode=new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }
        // step 2 :- newNode next=Head
        newNode.next=Head;  // link
        // step 3 :- head=newNode
        Head=newNode;

    }
    public void addLast(int data){
       // step 1 :- create new node
       Node newNode=new Node(data);
       size++;
       if(Head==null){
           Head=Tail=newNode;
           return;     
       }
       // step 2:- tail next=newnode 
       Tail.next=newNode;
       // step 3:- tail=newnode
       Tail=newNode;
    }
    public void addAnyPos(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=Head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // Print a linkedlist
    public void printLinkList(){   // O(n)
        if(Head==null){
            System.out.println("Linklist is empty !!!!!");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    // remove element in linked list
    // 1. remove first --> remove headnode
    // 2. remove last --> remove tail node
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty!!!!");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int value=Head.data;
            Head=Tail=null;
            size=0;
            return value;
        }
        int data=Head.data;
        Head=Head.next;
        size--;
        return data;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty!!!!");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int value=Head.data;
            Head=Tail=null;
            size=0;
            return value;
        }
        // prev : i-2
        Node prev=Head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;  // tail.data
        prev.next=null;
        Tail=prev;
        size--;
        return val;
    }

    // Search a element in linked list(Iterative way)

    public int search(int key){  //Tc: O(n)
        int i=0;
        Node temp=Head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    // Search a element in linked list(recursive way)
    public int helper(Node Head,int key){
        if(Head==null){
            return -1;
        }
        if(Head.data==key){
            return 0;
        }
        int idx=helper(Head.next, key);
        if(idx==-1){
            return -1;
        } else{
            return idx+1;
        }
    }
    public int resSearch(int key){   // Tc: O(n) Sc: O(n)
        return helper(Head,key);
    }

    // Reverse a Linked List (Iterative Way)
    public void reverse(){   // Tc:O(n)
        Node prev=null;
        Node curr=Tail=Head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }
    public static void main(String[] args) {
        LinkedListBasics ll=new LinkedListBasics();

        ll.addFirst(2);       
        ll.addFirst(1);
        
        ll.addLast(4);
        ll.addLast(5);

        ll.addAnyPos(2, 3);

        ll.printLinkList();

        // int key=5;
        // System.out.println(ll.search(key));
        // System.out.println(ll.resSearch(key));
        ll.reverse();
        ll.printLinkList();

        // System.out.println(ll.size);
    }
}