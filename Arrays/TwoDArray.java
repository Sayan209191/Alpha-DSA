import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        int matrix[][]=new int [3][4];
        int n=matrix.length;      // no of Rows
        int m=matrix[0].length;  // no of Columns
        Scanner sc=new Scanner(System.in);
        // Store the elements of the 2D array
        for(int row=0;row<n;row++){
            for(int column=0;column<m;column++){
                matrix[row][column]=sc.nextInt();
            }
        }
        // Print the 2d array
        for(int row=0;row<n;row++){
            for(int column=0;column<m;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
