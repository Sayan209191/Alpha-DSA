public class CountBst{
    public static int totalBst(int n) {

        if(n == 0 || n == 1) {
            return 1;
        }
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            // i -> 0->i-1 left sub tree & i-1 -> 0 right sub tree
            for(int j=0; j<i; j++) {
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left * right;
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(totalBst(n));
    }
}