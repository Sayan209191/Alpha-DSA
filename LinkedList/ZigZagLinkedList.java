public class ZigZagLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
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
    public void printLinkList(){   
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
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next;  
        }
        return slow;    // Slow is mid node 
    }
    public Node alternateMerging(Node leftHead,Node rightHead){
        Node zigzagll=new Node(-1);
        zigzagll.next=leftHead;
        Node nextL;
        Node nextR;
        while(leftHead != null && rightHead != null){
            // Zig-Zag
            nextL=leftHead.next;
            leftHead.next=rightHead;
            nextR=rightHead.next;
            rightHead.next=nextL;

            // updation 
            rightHead=nextR;
            leftHead=nextL;
        }
        return zigzagll.next;
    }
    public Node zigZagLinkedList(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // step 1 -> find mid

        Node mid=findMid(head);

        // Step 2 -> 2nd half reverse
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node rightHead=prev;
        Node leftHead=head;

        // step 3 -> alternate merging

        return alternateMerging(leftHead, rightHead);
    }

    public static void main(String[] args) {
        ZigZagLinkedList ll=new ZigZagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.printLinkList();
        
        // 

        ZigZagLinkedList.head=ll.zigZagLinkedList(ZigZagLinkedList.head);
        ll.printLinkList();

    }
}
