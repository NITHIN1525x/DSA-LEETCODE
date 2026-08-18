class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] nums = new int[m][n];
        for(int r = 0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                int startRow = Math.max(0,r-k);
                int endRow = Math.min(m-1,r+k);
                int startCol = Math.max(0,c-k);
                int endCol = Math.min(n-1,c+k);
                int sum = 0;
                for(int i=startRow;i<=endRow;i++)
                {
                    for(int j=startCol;j<= endCol;j++)
                    {
                        sum += mat[i][j];
                    }
                }
                nums[r][c] = sum;
            }
        }
        return nums;
    }
}