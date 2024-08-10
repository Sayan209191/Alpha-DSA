public class MergeSortInLinkedList {
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

    public Node getMidNode(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node merge(Node leftHead,Node rightHead){
        Node mergell=new Node(-1);
        Node temp=mergell;

        while(leftHead != null && rightHead != null){
            if(leftHead.data<=rightHead.data){
                temp.next=leftHead;
                temp=temp.next;
                leftHead=leftHead.next;
            } else{
                temp.next=rightHead;
                temp=temp.next;
                rightHead=rightHead.next;
            }  
        }
        while(leftHead != null){
            temp.next=leftHead;
            temp=temp.next;
            leftHead=leftHead.next;
        }
        while(rightHead != null){
            temp.next=rightHead;
            temp=temp.next;
            rightHead=rightHead.next;
        }

        return mergell.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // find mid
        Node mid=getMidNode(head);
        Node rightHead=mid.next;
        mid.next=null;

        // call merge sort
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        //  merge 

        return merge(newLeft,newRight);
    }

    // Merge Function 

    
    public static void main(String[] args) {
        MergeSortInLinkedList ll =new MergeSortInLinkedList();
        ll.addLast(8);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(15);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(1);
        ll.addLast(2);

        ll.printLinkList();

        MergeSortInLinkedList.head=ll.mergeSort(MergeSortInLinkedList.head);
        ll.printLinkList();
    }
}
