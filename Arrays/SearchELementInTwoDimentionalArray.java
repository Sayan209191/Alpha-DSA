public class SearchELementInTwoDimentionalArray {
    public static boolean search(int arr[][],int key){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==key){
                    System.out.println(key+" Found in index : "+row+","+col);
                    return true;
                } 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int target=5;
        System.out.print(search(matrix,target));
    } 
}
