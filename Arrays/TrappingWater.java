public class TrappingWater {
    public static void trappedWater(int arr[]) {
        int n=arr.length;
        // left max Bound
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        // Right max Bound
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        // count total trapper water
        int trapped=0;
        for(int i=0;i<n;i++){
            int wl=Math.min(leftmax[i],rightmax[i]);
            trapped+=wl-arr[i];
        }
        System.out.println("Total Trapped Water : "+ trapped);
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        trappedWater(height);
    }
}
