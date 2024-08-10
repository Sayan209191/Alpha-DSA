import java.util.PriorityQueue;
import java.util.ArrayList;

public class KWeakestSoliders {

    static class Army implements Comparable<Army>{
        int idx;
        int soliders;

        public Army(int idx, int soliders) {
            this.idx = idx;
            this.soliders = soliders;
        }

        @Override
        public int compareTo(Army A1) {
            if(this.soliders == A1.soliders) {
                return this.idx - A1.idx;
            } else {
                return this.soliders - A1.soliders;
            }
        }
    }

    public static ArrayList<Integer> kWeakSoliders(int arr[][], int n,int m,int k) {

        PriorityQueue<Army> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<m; j++) {
                if(arr[i][j] == 1) {
                    count++;
                } else if(arr[i][j] == 0) break;
            }
            pq.add(new Army(i, count));
        }

        for(int i=0; i<k; i++) {
            al.add(pq.remove().idx);
        }

        return al;
    }

    public static void main(String[] args) {
        int soliders [][] = { {1,0,0,0},
                              {1,1,1,1},
                              {1,0,0,0},
                              {1,0,0,0}
        };
        int k = 2;

        System.out.println(kWeakSoliders(soliders, soliders.length, soliders[0].length, k));
    }
}
