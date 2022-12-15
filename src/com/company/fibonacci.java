class Solution {
    public int fib(int n) {
        int f1=0;
        int f2=1;

        if(n == 0)
            return 0;
        
        if(n == 1)
            return 1;

        for(int i=2; i<=n; i++)
        {
            int t = f2;
            f2 = f1 + f2;
            f1 = t;
        }

        return f2;
    }
}

