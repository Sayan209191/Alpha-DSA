import java.util.*;

public class CatalanNumber {
    // recursion
    public static int catalanRec(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += catalanRec(i) * catalanRec(n-i-1); 
        }
        return ans;
    }

    // memoization
    public static int catalanMemo(int n, int dp[]) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += catalanMemo(i, dp) * catalanMemo(n-i-1, dp);
        }
        return dp[n] = ans % 1000000007;
    }

    // Tabulation

    public static int catalanTab(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        long dp[] = new long[n+1];

        dp[0] = 1;
        dp[1] = 1;


        for(int i=2; i<=n; i++) {
            for(int j=0; j<i; j++) {
                dp[i] = (dp[i] + dp[j]*dp[i-j-1])% 1000000007;
                
            }
        }

        return (int) dp[n] % 1000000007;
    }
    public static void main(String[] args) {
        int n = 175;
        // System.out.println(catalanRec(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalanMemo(n, dp));

        System.out.println(catalanTab(n));
    }
}
