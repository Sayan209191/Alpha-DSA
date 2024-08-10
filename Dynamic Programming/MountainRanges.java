public class MountainRanges {
    public static int totalMountain(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            // i pairs --> ci of mountain ranges
            for(int j=0; j<i; j++) {
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside*outside; 
            }
        }
        // n pairs
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(totalMountain(n));
    }
}
