public class PairingProblem {
    // Pairing Problem
    public static int totalPair(int n){
        if(n==1 || n==2){
            return n;
        }
        // choice 1 :- Single 
        // choice 2 :-  pairing -> 1 friend can chose pair from n-1 friend
        // combination Problem --> (n-1) -> Pair Choice
        // f(n-2) -> 1 Pair ways
        return totalPair(n-1)+(totalPair(n-2)*(n-1));
    }
    public static void main(String[] args) {
        System.out.println(totalPair(3));
    }
}
