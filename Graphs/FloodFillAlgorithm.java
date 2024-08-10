public class FloodFillAlgorithm {

    public static void helper(int image[][], int sr, int sc, int color,int orgCol, boolean vis[][]) {
        // Base 
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length 
            || vis[sr][sc] || image[sr][sc] != orgCol ) {
                return;
        }

        if(image[sr][sc] == orgCol) {
            vis[sr][sc] = true;
            image[sr][sc] = color;
        }
        // Up
        helper(image, sr-1, sc, color, orgCol, vis);
        // Down
        helper(image, sr+1, sc, color, orgCol, vis);
        // Right
        helper(image, sr, sc+1, color, orgCol, vis);
        // Left
        helper(image, sr, sc-1, color, orgCol, vis);
    }

    public static int[][] floodFill(int image[][], int sr, int sc, int color) {

        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, image[sr][sc], vis);

        return image;
    }
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1},
                         {1, 1, 0},
                         {1, 0 ,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;      
        
        int ans[][] = floodFill(image, sr, sc, color);

        for(int i=0; i<ans.length; i++) {
            for(int j=0; j<ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
