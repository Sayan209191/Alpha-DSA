public class SegmentTreeCreation {
    // segment tree creation for sub array sum problem
    // initlize tree array
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
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        init(arr);
        create(arr, 0, 0, arr.length-1);
        print();
    }
}