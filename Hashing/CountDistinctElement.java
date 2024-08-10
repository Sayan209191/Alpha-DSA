import java.util.HashSet;
import java.util.ArrayList;

public class CountDistinctElement {

    // Bruteforce approch 
    public static int distinctEle(int arr[],int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int num=arr[i];
            boolean flag = false;
            for(int j=0; j<result.size(); j++) {
                if(num == result.get(j)) {
                    flag=true;
                }
            }
            if(flag == false) {
                result.add(num);
            }
        }
        return result.size();
    }

    // Optimize approch

    public static int countDistinctEle(int arr[],int n) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        // System.out.println(distinctEle(nums, nums.length));
        System.out.println(countDistinctEle(nums, nums.length));
    }
}
