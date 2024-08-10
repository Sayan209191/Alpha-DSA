import java.util.ArrayList;
public class PairSum1 {
    // BrouteForce  ----> O(n^2)
    public static boolean pairExists(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    // Optimize -> 2 pointer approch --> O(n)
    public static ArrayList<Integer> printPair(ArrayList<Integer> list,int target){
        ArrayList<Integer> ans=new ArrayList<>();
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                ans.add(lp);
                ans.add(rp);
                break ;
            } else if(list.get(lp)+list.get(rp)<target){
                lp++;
            } else{
                rp--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=6;i++){
            list.add(i*1);
        }
        int target=5;
        // System.out.println(pairExists(list, target));
        // System.out.println(printPair(list, target));
        ArrayList<Integer> ans=printPair(list, target);
        System.out.println(ans);
    }
}
