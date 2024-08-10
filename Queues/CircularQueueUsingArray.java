public class CircularQueueUsingArray {
    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(3);
        q.enQue(1);
        q.enQue(2);
        q.enQue(3);
        System.out.println(q.deQueue());
        q.enQue(4);
        System.out.println(q.deQueue());
        q.enQue(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        } 
    }
}

class CircularQueue{
    static int arr[];
    static int size;
    static int rear;
    static int front;
    CircularQueue(int n){
        arr=new int[n];
        size=n;
        rear=-1;
        front=-1;
    } 
    
    // Implement is Empty function

    public  boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    // circular queue full or not 

    public boolean isFull(){
        return (rear+1)%size == front;
    }

    // Implement add -> Enque operation

    public  void enQue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        } 

        // add first element in a empty queue

        if(front==-1){
            front=0;
        }
        rear=(rear+1) % size;
        arr[rear]=data;
    } 

    // Implement remove -> Dequeue operation

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result=arr[front];
        
        // remove last element 
        if(rear==front){
            rear=front=-1;
        } else{
            front=(front+1)%size;
        }
        return result;
    }

    // Implement peek function 

    public  int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
}    