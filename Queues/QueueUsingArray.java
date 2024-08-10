public class QueueUsingArray{
    
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enQue(1);
        q.enQue(2);
        q.enQue(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        } 
    }
}
class Queue{
    static int arr[];
    static int size;
    static int rear;
    Queue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
    } 
    
    // Implement is Empty function

    public boolean isEmpty(){
        return rear==-1;
    }

    // Implement add -> Enque operation

    public void enQue(int data){
        if(rear==size-1){
            System.out.println("Queue is Full");
            return;
        } 

        arr[++rear]=data;
    } 

    // Implement remove -> Dequeue operation

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
    }

    // Implement peek function 

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }
}