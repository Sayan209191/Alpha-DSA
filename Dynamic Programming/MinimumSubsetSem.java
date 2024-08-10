public class MinimumSubsetSem {

    public static int helper(int arr[], int w) {
        int n = arr.length;
        int dp[][] = new int[n+1][w+1];
        for(int i=0; i<=n; i++) {
            dp[i][0] = 0;
        }
        for(int j=0; j<=w; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=w; j++) {
                if(arr[i-1] <= j) {
                    int ans1 = arr[i-1]+dp[i-1][j-(arr[i-1])];
                    int ans2 = dp[i-1][j];

                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    dp[i][j] = dp[i-1][j];
                }    
            }
        }

        return dp[n][w];

    }
    public static int minDiff(int arr[]) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        int w = sum/2;
        int sum1 = helper(arr, w);
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        int nums[] = {1, 6, 11, 5};

        System.out.println(minDiff(nums));
    }
}
