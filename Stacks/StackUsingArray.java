public class StackUsingArray {
    static class Stack {
        static int[] stack;
        static int top = -1;
        static int stackSize = 0;
        Stack(int capacity) {
            stack = new int[capacity];
            stackSize = capacity;
        }
        public void push(int num) {
            if (isFull() == 0){
                stack[++top] = num;
            }
        }
        public int pop() {
            if (isEmpty() == 1){
                return -1;
            }
            return stack[top--];
        }
        public int top() {
            if (isEmpty() == 1){
                return -1;
            }
            int topEle = stack[top];
            stack[top] = 0;
            return topEle;
        }
        public int isEmpty() {
            return (top == -1)? 1:0;
        }
        public int isFull() {
            return (top == stackSize - 1)?1:0;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(5);
        s.pop();
        for(int i=0; i<5; i++) {
            System.out.print(Stack.stack[i]);
        }
    }
}
