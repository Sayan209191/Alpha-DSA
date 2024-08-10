public class FindAndRemoveNthNode {
    // Find and remove n'th node from end
    // Amazon , Adobe , Qualcomm , flipkart

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
    // add element
    public void addLast(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=Tail=newNode;
            return;     
        } 
        Tail.next=newNode;
        Tail=newNode;
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

    public void deleteNthFromEnd(int n){
        int size=0;
        Node temp=Head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(size==n){
            Head=Head.next;
            return;
        }

        // size-n
        int i=1;
        Node prev=Head;
        int iToNth=size-n;
        while(i<iToNth){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    public static void main(String[] args) {
        FindAndRemoveNthNode ll=new FindAndRemoveNthNode();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printLinkList();  // 1->2->3->4->5->null
        int n=3;
        ll.deleteNthFromEnd(n);
        ll.printLinkList();
    }

}
