class Solution {
    public int climbStairs(int n) {
        int l1 = 1;
        int l2 = 1;
        
        if(n == 1)
            return 1;
        
        while(n > 1)
        {
            int t = l2;
            l2 = l2 + l1;
            l1 = t;
            
            n--;
        }
        return l2;
    }
}
