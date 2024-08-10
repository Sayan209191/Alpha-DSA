public class CheckPalindrome {
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

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; // move slow pointer one step at a time
            fast=fast.next.next;  // move fast pointer two steps at a time
        }
        return slow;    // Slow is mid node 
    }
    
    public boolean checkPalindrome(){
        // Edge case --> empty or single node linkedlist
        if(head==null || head.next==null){
            return true;
        }
        // Step 1 : find middle
        Node mid=findMid(head);
        // Step 2 : reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head; 
        // Step 3 : Check 1st half == 2nd half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    
    public boolean isPalindrome() {
        Node l=head,r=l.next,t=null;
		boolean ans=true;
		while(l!=r && (t!=l && t!=r)) {
			while(r.next!=t) {
				r=r.next;
			}
			if(l.data==r.data) {
				l=l.next;
				t=r;
				r=l.next;
			} else {
				ans=false;
				break;
			}
		}
		return ans;
    }
    
    public static void main(String[] args) {
        CheckPalindrome ll=new CheckPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addLast(1);
        System.out.println(ll.isPalindrome());
    }
}
