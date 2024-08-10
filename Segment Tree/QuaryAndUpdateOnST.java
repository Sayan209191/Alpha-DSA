public class QuaryAndUpdateOnST {
    static int tree[];
    public static void init(int arr[]) {
        tree = new int[arr.length * 4];
    }

    public static void create(int arr[],int stidx, int start, int end) {
        if(start == end) {
            tree[stidx] = arr[start];
            return;
        }
        int mid = (start+end)/2;
        create(arr, stidx*2+1, start, mid);    // left child --> 2*i+1
        create(arr, stidx*2+2, mid+1, end);    // right child --> 2*i+2
        tree[stidx] = tree[stidx*2+1] + tree[stidx*2+2];
    }

    // print

    public static void print() {
        for(int i=0; i<tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
    }

    // Quary --> calculate subarray sum for any random range

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if(qj <= si || qi>= sj) { // non overlap
            return 0;
        } else if(si >= qi && sj<= qj) { // complete overlap
            return tree[i];
        } else {
            int mid = (si+sj)/2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right; 
        }
    }
    public static int getSum(int arr[], int qi, int qj) {
        init(arr);
        create(arr, 0, 0, arr.length-1);
        return getSumUtil(0, 0, arr.length-1, qi, qj);
        
    }

    // Update on given index

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if(si < idx || sj > idx) {
            return;
        }

        tree[i] += diff;
        if(si != sj) {
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff); // left subtree
            updateUtil(2*i+2, mid+1, sj, idx, diff);  // Right subtree
        }
    }

    public static void update(int arr[], int idx, int val) {
        int n = arr.length;
        int diff = val-arr[idx];
        arr[idx] = val;
        updateUtil(0, 0, n-1, idx, diff);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int qi=2, q2=5;

        System.out.println(getSum(arr, qi, q2));
        int newval = 2;
        int idx = 2;
        update(arr, idx, newval);
        System.out.println(getSum(arr, qi, q2));
        print();
    }
}
