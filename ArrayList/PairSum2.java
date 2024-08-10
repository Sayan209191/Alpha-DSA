import java.util.ArrayList;
public class PairSum2 {
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
    // optimize Solution ---> 2 pointer approch --> O(n)

    public static ArrayList<Integer> printPair(ArrayList<Integer> list,int target){
        int bp=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                ans.add(lp);
                ans.add(rp);
                break ;
            } else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            } else{
                rp=(list.size()+rp-1)%list.size();
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            ans.add(-1);
            return ans;
        } else{
            return ans;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=100;
        ArrayList<Integer> ans=printPair(list, target);
        System.out.println(ans);
    } 
}


