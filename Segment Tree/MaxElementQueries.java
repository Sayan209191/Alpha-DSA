public class MaxElementQueries {

    static int tree[];
    public static void init(int arr[]) {
        tree = new int[arr.length * 4];
    }

    public static void create(int arr[], int i, int si, int sj) {
        if(si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si+sj) / 2;
        create(arr, 2*i+1, si, mid);
        create(arr, 2*i+2, mid+1, sj);
        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    } 
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if(qj < si || qi > sj) {
            return Integer.MIN_VALUE;
        } else  if(si >= qi && sj<= qj) {
            return tree[i];
        } else {
            int mid = (si+sj) / 2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);

            return Math.max(left, right);
        }
    }

    // Update

    public static void update(int arr[], int idx, int val) {
        int n = arr.length;
        arr[idx] = val;
        updateUtil(0, 0, n-1, idx, val);
    }
    public static void updateUtil(int i, int si, int sj , int idx, int val){
        if(idx < si || idx > sj) {
            return;
        }

        if(si == sj) {
            tree[i] = val;
        } 
        if(si != sj){
            tree[i] = Math.max(tree[i], val);
            int mid = (si+ sj)/2;
            updateUtil(2*i+1, si, mid, idx, val);
            updateUtil(2*i+2, mid+1, sj, idx, val);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        init(arr);
        create(arr, 0, 0, arr.length-1);

        // System.out.println(getMax(arr, 0, 4));

        update(arr, 2, 19);
        System.out.println(getMax(arr, 0, 5));
    }
}
