public class NQueenProblem {
    
    // All Possible Solutions print
    // No of Posible solutions
    // if solution present print only one solution 

    public static boolean isSafe(char board[][],int row,int col){
        // vertically Up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // Right diagonally Up
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // Left Diagonally Up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][],int row){
        // base case
        if(row==board.length){
            // printBoard(board);
            count++;
            return true;
        }
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board, row,j)){
                board[row][j]='Q';
                if(nQueen(board, row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
        return false;
    }
    static int count=0;
    public static void printBoard(char board[][]){
        System.out.println("-------------Chess Board -----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        // Intilize the Board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='X';
            }
        }            
        if(nQueen(board,0)){
            System.out.println("Sollution is Possible");
            printBoard(board);
        }
        else{
            System.out.println("Sollution is Not Possible");
        }
        // System.out.println("Total Ways to solve NQueens : "+count );
    }
}
