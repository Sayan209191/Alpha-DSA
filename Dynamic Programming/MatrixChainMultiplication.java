import java.util.Arrays;

public class MatrixChainMultiplication {
    // Recursion Solution --> O(2^n)
    public static int mcmRec(int arr[], int i, int j) {
        if(i ==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) { // k th partition 
            int cost1 = mcmRec(arr, i, k);  // cost of A1.....Ak
            int cost2 = mcmRec(arr, k+1, j); // cost of Ak+1 ... Aj
            int cost3 = arr[i-1]*arr[k]*arr[j]; // resultended 2 matrix --> R1 (a1*ak) * R2 (ak*aj)
            int totalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans,totalCost);
        }

        return ans;
    }

    // Memoization -> O(n^2)
    public static int mcmMemo(int arr[], int i, int j, int dp[][]) {
        if(i == j) return 0;

        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];

            ans = Math.min(cost1+cost2+cost3, ans);
        }

        return dp[i][j] = ans;
    }

    // Tabulation

    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        // intilization
        for(int i=0; i<n; i++) {
            dp[i][i] = 0;
        }

        // filling

        for(int len=2; len<=n-1; len++) {
            for(int i=1; i<=n-len; i++) {
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;

                for(int k=i; k<=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];

                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }

        
        // ans will be store in [1,n-1] index
        return dp[1][n-1];
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;

        int dp[][] = new int[n][n];

        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i],-1);
        }

        System.out.println(mcmRec(arr, 1, n-1));
        System.out.println(mcmMemo(arr, 1, n-1, dp));
    
        System.out.println(mcmTab(arr));
    }
}
