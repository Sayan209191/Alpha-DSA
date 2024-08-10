public class CountANumberInTwoDArray {
    public static int countANum(int arr[][],int num){
        int count=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==num){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int numbers[][]={{4,7,8},{8,8,7}};
        int num=7;
        System.out.println(num+" Present in the Matrix "+countANum(numbers, num)+" Times");
    }
}
