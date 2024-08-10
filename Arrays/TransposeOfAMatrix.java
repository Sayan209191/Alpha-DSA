public class TransposeOfAMatrix {
    // Transpose of a Matrix
    public static void transpose(int arr[][]) {
        // transepose --> row= col of org matrix , col=row of org matrix
        int trans_mat[][]=new int[arr[0].length][arr.length];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                trans_mat[col][row]=arr[row][col]; 
            }
        }
        // Print the Transpose Matrix
        for(int row=0;row<trans_mat.length;row++){
            for(int col=0;col<trans_mat[0].length;col++){
                System.out.print(trans_mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    // Print Matrix
    public static void printMatrix(int arr[][]){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[][]={{4,7,8},{8,8,7}};
        System.out.println("Orginal Matrix -->");
        printMatrix(numbers);
        System.out.println("Transpose Matrix -->");
        transpose(numbers);
    }
}
