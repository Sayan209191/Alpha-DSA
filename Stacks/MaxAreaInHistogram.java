import java.util.Stack;
public class MaxAreaInHistogram {
    public static int maxArea(int arr[]){    // O(n)
        int n=arr.length;
        int max_area=0;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        Stack<Integer>s=new Stack<>();

        // Calculate next Smaller right (nsr)

        for(int i=n-1;i>=0;i--){
            while( !s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            } else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }         

        // Calculate next Smaller left

        s=new Stack<>();    // for empty the stack

        for(int i=0;i<n;i++){
            while( !s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=n;
            } else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // Calculate maximum area 
        // width = j-i-1 --> nsr[i]-nsl[i]-1 

        for(int i=0;i<n;i++){
            int currArea=arr[i]*(nsr[i]-nsl[i]-1 );
            max_area=Math.max(currArea,max_area);
        }
        return max_area;
    }
    public static void main(String[] args) {
        int histrogram[]={2,1,5,6,2,3};
        System.out.println("Maximum area of Histrogram is : "+maxArea(histrogram));
    }
}
