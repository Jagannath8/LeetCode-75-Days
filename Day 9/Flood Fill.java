class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color==image[sr][sc])
            return image;
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void helper(int image[][], int row, int col, int color, int oldColor){
        if(row>=image.length || row<0 || col>=image[0].length || col<0 || image[row][col]!=oldColor)
            return;
        image[row][col]=color;

        helper(image, row-1, col, color, oldColor);
        helper(image, row+1, col, color, oldColor);
        helper(image, row, col-1, color, oldColor);
        helper(image, row, col+1, color, oldColor);
    }
}
