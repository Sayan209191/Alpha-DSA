public class WildCardMatching {
    public static boolean isMatched(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();
        
        boolean dp[][] = new boolean[n+1][m+1];
        // initilization
        dp[0][0] = true;
        // p=""
        for(int i=1; i<n+1; i++) { // string length = 0
            dp[i][0] = false;
        } 
        // s=""
        for(int j=1; j<m+1; j++) {
            if(pattern.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-1];
            } 
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++) {
                if(str.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(pattern.charAt(j-1) == '*') {  // if * --> choice 1 -> ignore , ch2 -> use
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                } else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";

        System.out.println(isMatched(text, pattern));
    }
}
