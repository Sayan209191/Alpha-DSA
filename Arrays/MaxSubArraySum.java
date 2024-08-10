public class MaxSubArraySum {
    // Brute Force Solution --->
    public static int maxSumOfSubArray(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int cur_sum=0;
                for(int k=i;k<=j;k++){                   
                    cur_sum+=arr[k];
                }
                if(max_sum<cur_sum){
                    max_sum=cur_sum;
                }
            }
        }
        return max_sum;
    }
    // Another approch -> use Prefix Array)
    public static int maximumSumOfSubArray(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                cur_sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(max_sum<cur_sum){
                    max_sum=cur_sum;
                }
            }
        }
        return max_sum;
    }
    // more Optimize Solution --> KADANE's algorithm
    public static void kadaneAlgorithm(int arr[]) {
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        for(int i=0;i<arr.length;i++){
            cur_sum+=arr[i];
            if(cur_sum<0){
                cur_sum=0;
            }
            max_sum=Math.max(max_sum,cur_sum);
        }
        System.out.println("Max Sum : "+max_sum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        // int maximum_sum=maxSumOfSubArray(numbers);
        int maximum_sum=maximumSumOfSubArray(numbers);
        System.out.println("Maximum sum of all the Sub Array : "+maximum_sum);
        kadaneAlgorithm(number);
    }
}