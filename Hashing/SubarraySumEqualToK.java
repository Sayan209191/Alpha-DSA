import java.util.HashMap;

public class SubarraySumEqualToK {
    public static int subarrayWithKSum(int arr[],int n,int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0, 1);
        for(int i=0; i<n; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)) {
                ans += map.get(sum-k) ;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        } 

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        System.out.println(subarrayWithKSum(arr, arr.length, k));
    }
}
