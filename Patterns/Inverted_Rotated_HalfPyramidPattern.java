public class Inverted_Rotated_HalfPyramidPattern {
    public static void invertedHalfPyramid(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j<=4-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invertedHalfPyramid();
    }
    
}
