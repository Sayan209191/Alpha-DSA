import java.util.ArrayList;

public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty() {
            return arr.size()==0;
        }

        public void add( int data) {
            arr.add(data);
            int x = arr.size()-1;  // Last index
            int par = (x-1)/2;  // Parents index

            while(arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
        
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if( minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }

        }

        public int remove() {
            int data = arr.get(0);

            // Step 1: swap root with las index
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // Step 2 : remove last Node
            arr.remove(arr.size()-1);

            // Step 3 : Heapify
            heapify(0);
            return data;

        }
    }

    public static void main(String[] args) {
        Heap H = new Heap();
        H.add(5);
        H.add(4);
        H.add(9);
        H.add(1);

        while(!H.isEmpty()) {
            System.out.println(H.peek());
            H.remove();
        }
    }
}
