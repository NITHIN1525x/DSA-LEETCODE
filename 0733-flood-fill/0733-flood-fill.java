class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc == color)
        {
            return image;
        }
        dfs(sr,sc,image,oc,color);
        return image;
    }
    public void dfs(int row,int col, int[][] image,int oc, int nc)
    {
        image[row][col] = nc;
        if(row-1 >= 0 && image[row -1][col] == oc)
        {
            dfs(row-1,col,image,oc,nc);
        }
        if(col+1 < image[0].length && image[row][col+1] == oc)
        {
            dfs(row,col+1,image,oc,nc);
        }
        if(row+1 < image.length && image[row +1][col] == oc)
        {
            dfs(row+1,col,image,oc,nc);
        }
        if(col-1 >= 0 && image[row][col-1] == oc)
        {
            dfs(row,col-1,image,oc,nc);
        }
    }
}