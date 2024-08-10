import java.util.HashMap;
import java.util.ArrayList;
// import java.util.Set;

public class MejorityElement {
    public static ArrayList<Integer> majorityElement(int arr[],int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            int nums = arr[i];
            // if(map.containsKey(nums)) {
            //     map.put(nums, map.get(nums)+1);
            // } else {
            //     map.put(nums,1);
            // }
            map.put(nums,map.getOrDefault(nums, 0)+1);
        }
        // Set<Integer>keys = map.keySet();
        for (Integer i : map.keySet()) {
            if(map.get(i) >= n/3) {
                ans.add(i);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        System.out.println(majorityElement(nums, nums.length));
    }
}
