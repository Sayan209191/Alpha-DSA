import java.util.ArrayList;
public class Stack_AL{
    static ArrayList<Integer> list=new ArrayList<>();
    // check stack is empty or not
    public boolean isEmpty(){
        return list.size()==0;
    }
    // Push Operation
    public void push(int data){
        list.add(data);
    }
    // pop operation 
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    // Peek operation --> find the top's element
    public int peek(){
        if(isEmpty()){
            return -1;
        } 
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        Stack_AL S=new Stack_AL();
        S.push(1);
        S.push(2);
        S.push(3);
        while(! S.isEmpty()){
            System.out.println(S.pop());
        }
    }
}