class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

        int m = mat.length;       // number of rows
        int n = mat[0].length;    // number of columns

        int[][] ans = new int[m][n];

        // Go through every cell
        for (int r = 0; r < m; r++) {

            for (int c = 0; c < n; c++) {

                int sum = 0;

                // Find the starting row
                // r-k might go outside the matrix, so use Math.max(0, r-k)
                int startRow = Math.max(0, r - k);

                // Find the ending row
                // r+k might go outside the matrix, so use Math.min(m-1, r+k)
                int endRow = Math.min(m - 1, r + k);

                // Find the starting column
                int startCol = Math.max(0, c - k);

                // Find the ending column
                int endCol = Math.min(n - 1, c + k);

                // Now visit every cell inside this block
                for (int i = startRow; i <= endRow; i++) {

                    for (int j = startCol; j <= endCol; j++) {

                        // Add that cell to our current cell's sum
                        sum += mat[i][j];
                    }
                }

                // Store the calculated sum
                ans[r][c] = sum;
            }
        }

        return ans;
    }
}