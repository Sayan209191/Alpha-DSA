import java.util.Stack;
public class NextGreaterElement{
    // Veritys of this question
    // Next Greater right
    // Next Greater left
    // Next Smaller right
    // next Smaller left

    public static int [] nextGreater(int arr[]){
        Stack<Integer> s= new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            // step 1 : pop until stack not empty and stack[top]<=arr[i]
            while(! s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // step 2 : check stack empty or not
            if(s.isEmpty()){
                nextGreater[i]=-1;
            } else{
                nextGreater[i]=arr[s.peek()];
            }

            // step 3 : push i in stack
            s.push(i);
        }
        return nextGreater;
    } 
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={6,8,0,1,3};
        printArray(nums);
        int ans[]=nextGreater(nums);
        printArray(ans);
    }
}