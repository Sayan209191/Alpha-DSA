public class HollowRectanglePattern {
    public static void hollowRectangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
                // if(i==1 || i==4){
                //     System.out.print("*");
                // }
                // else{
                //     if(j==1 || j==5){
                //         System.out.print("*");
                //     }
                //     else{
                //         System.out.print(" ");
                //     }
                // }
                if(i==1 || i==n || j==1 || j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowRectangle(4);
    }
}
