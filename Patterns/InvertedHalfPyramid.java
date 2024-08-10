public class InvertedHalfPyramid {
    public static void invertedHalfPyramid(int n){
        // for(int i=5;i>=0;--i){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        invertedHalfPyramid(5);
    }
    
}
