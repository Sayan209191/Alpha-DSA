import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class IndiansCoins {
    public static ArrayList<Integer> minCoin(int ammount) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i] <= ammount){
                while(coins[i]<= ammount){
                    ans.add(coins[i]);
                    ammount -= coins[i];
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int ammount=590;
        System.out.println("Minimum Coins : "+minCoin(ammount));
    }
}
