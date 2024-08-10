import java.util.Arrays;
public class MinAbsuluteDifferencePair {
    public static int minAbsPairDiff(int a[],int b[]){ // Tc : O(nlog(n))
        Arrays.sort(a);
        Arrays.sort(b);
        int min = 0;
        for(int i=0;i<a.length;i++){
            min+=Math.abs(a[i]-b[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int a[] = {4,1,7,8};
        int b[] = {2,3,6,5};
        System.out.println("Minimum absulute difference : "+ minAbsPairDiff(a, b));
    }
}
