import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    // Bruteforce approch  --> Tc -> O(n^2) , Sc -> O(1)

    public static int largeSubarray(int arr[],int n) {
        int len = 0;
        for(int i=0; i<n; i++) {
            int sum = arr[i];
            for(int j=i+1; j<n; j++) {
                sum += arr[j];
                if(sum == 0) {
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }

    // Optimize approch --> Tc -> O(n) , Sc -> O(n)
    public static int largestSubarray(int arr[],int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int j=0; j<n; j++) {
            sum+=arr[j];
            if(map.containsKey(sum)) {
                len = Math.max(len, j-map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int nums[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(largestSubarray(nums, nums.length));
        System.out.println(largeSubarray(nums, nums.length));
    }
}
