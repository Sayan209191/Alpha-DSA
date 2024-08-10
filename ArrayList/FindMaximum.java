import java.util.ArrayList;

public class FindMaximum {
    // Swap 2 Number (given 2 index) 
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // maximum in a arraylist

        int max=Integer.MIN_VALUE;   // O(n)
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("The Maximum element is : "+max);
        
        // Swap 

        int idx1=1;
        int idx2=3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);
    }
}
