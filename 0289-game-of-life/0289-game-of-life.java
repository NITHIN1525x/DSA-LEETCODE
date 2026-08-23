class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] copy = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                copy[i][j] = board[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int c=0;
                for(int x=i-1;x<=i+1;x++)
                {
                    for(int y=j-1;y<=j+1;y++)
                    {
                        if(x == i && y==j)
                        {
                            continue;
                        }
                        if(x >= 0 && x <m && y>=0 && y< n)
                        {
                            if(board[x][y] == 1)
                            {
                                c++;
                            }
                        }
                    }
                }
                if(board[i][j] == 1)
                {
                    if(c == 2 || c == 3)
                    {
                        copy[i][j] = 1;
                    }
                    else
                    {
                        copy[i][j] = 0;
                    }
                }
                else
                {
                    if(c == 3)
                    {
                        copy[i][j] = 1;
                    }
                    else
                    {
                        copy[i][j] = 0;
                    }
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = copy[i][j];
            }
        }
    }
}