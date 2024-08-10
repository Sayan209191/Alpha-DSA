public class ReverseALinkedList {
    public static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    // add element
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;     
        } 
        tail.next=newNode;
        tail=newNode;
    }

    public static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Update the head and tail pointers
        head = prev;
        tail = head;
    }
    public static void printLinkList(){   // O(n)
        if(head==null){
            System.out.println("Linklist is empty !!!!!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        ReverseALinkedList ll = new ReverseALinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        printLinkList();

        reverse();

        printLinkList();
    }
}
