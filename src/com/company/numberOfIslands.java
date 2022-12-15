class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int ans=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j] == '1')
                {
                    ans++;
                    islands(grid, i, j, m, n);
                }
            }
        }
        return ans;
    }

    void islands(char[][] arr, int x, int y, int r, int c)
    {
        if(x < 0|| x >= r|| y < 0 || y >= c || arr[x][y] != '1')
            return;

        arr[x][y] = '2';

        islands(arr, x+1, y, r, c);
        islands(arr, x-1, y, r, c);
        islands(arr, x, y-1, r, c);
        islands(arr, x, y+1, r, c);
    }
}

