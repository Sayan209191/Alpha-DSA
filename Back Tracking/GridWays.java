public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {   // O(2^m+n)
        // Base Case
        if (i == n-1 && j == m-1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        // Main Funda
        return gridWays(i + 1, j, n, m) + gridWays(i, j + 1, n, m);
    }
    // Optimized Solutions
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int countGridWays(int i,int j,int n,int m){
        int ans1=factorial((n-1-i)+(m-1-i));
        int ans2=factorial(n-1-i);
        int ans3=factorial(m-1-i);
        return ans1/(ans2*ans3);
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countGridWays(0, 0, n, m));
    }
}
