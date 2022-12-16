class Solution {
    
    public int uniquePaths(int m, int n) {
        int x=0, y=0;
        //int ans1 = solve1(x, y, m, n); // 1 solution
        int ans2 = solve2(m, n);
        return ans2;
    }

    int solve2(int m, int n)
    {
        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++)
            dp[i][0] = 1;

        for(int i=0; i<n; i++)
            dp[0][i] = 1;

        for(int i=1; i<m; i++)
        {
            for(int j=1; j<n; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }

    int solve1(int x, int y, int r, int c)
    {
        int ans=0;

        if(x < 0 || x >= r || y < 0 || y >= c)
            return 0;

        if(x == r-1 && y == c-1)
            return 1;

        ans += solve1(x, y+1, r, c);
        ans += solve1(x+1, y, r, c);

        return ans;
    }
}

