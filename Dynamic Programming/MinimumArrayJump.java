import java.util.Arrays;
public class MinimumArrayJump {

    public static int minJump(int arr[]) {
        int n =arr.length;
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        
        // initilization
        dp[n-1] = 0;

        // filling
        for(int i=n-2; i>=0; i--) {
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int jump=i+1; jump<=i+steps && jump<n; jump++) {
                if(dp[jump] != -1) {
                    ans = Math.min(ans, 1+dp[jump]);
                }
            }
            dp[i] = ans != Integer.MAX_VALUE?ans:-1;
        }

        return dp[0];

    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};

        System.out.println(minJump(arr));
    }
}
