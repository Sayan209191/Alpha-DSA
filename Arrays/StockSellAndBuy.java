public class StockSellAndBuy {
    public static void sellBuy(int arr[]) {
        int n=arr.length;
        int bp=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<n;i++){
            if(arr[i]>bp){
                int profit=arr[i]-bp;
                max_profit=Math.max(max_profit,profit);
            }
            else{
                bp=arr[i];
            }
        }
        System.out.println("Max Profit : "+ max_profit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        sellBuy(arr);
    }
}
