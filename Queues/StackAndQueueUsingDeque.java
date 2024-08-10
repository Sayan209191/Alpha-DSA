import java.util.*;
public class StackAndQueueUsingDeque {
    static class Stack{

        Deque<Integer> d =new LinkedList<>();

        public boolean isEmpty(){
            return d.isEmpty();
        }

        public void push(int data){
            d.addLast(data);
        }

        public int pop(){
            return d.removeLast();
        }
        
        public int peek(){
            return d.getLast();
        }
    }

    static class Queue{

        Deque<Integer> d =new LinkedList<>();

        public boolean isEmpty(){
            return d.isEmpty();
        }

        public void add(int data){
            d.addLast(data);
        }

        public int remove(){
            return d.removeFirst();
        }

        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
