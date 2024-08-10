import java.util.*;

public class UnionAndIntersection {

    public static ArrayList<Integer> union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (Integer i : arr1) {
            set.add(i);
        }
        for (Integer i : arr2) {
            set.add(i);
        }
        for (Integer ele : set) {
            ans.add(ele);
        }
        set.clear();
        return ans;
    }

    public static ArrayList<Integer> intersection(int arr1[],int arr2[]) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (Integer i : arr1) {
            set.add(i);
        }

        for (Integer i : arr2) {
            if(set.contains(i)) {
                ans.add(i);
                set.remove(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println("Union : "+ union(arr1, arr2));
        System.out.println("Intersection : "+ intersection(arr1, arr2));
    }
}
