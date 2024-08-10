public class PowerOfXN {
    public static int power(int x,int n){   // O(n)
        // base case
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    // Optimized Solutions
    public static int optimizedPower(int x,int n){   // O(log(n))
        // base case
        if(n==0){
            return 1;
        }
        int halfpower=optimizedPower(x,n/2);
        if(n%2==0){
            return halfpower*halfpower;
        }
        else{
            return x*halfpower*halfpower;
        }
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2,25));
    }
}
