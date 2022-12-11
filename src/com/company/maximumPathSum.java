int ans=Integer.MIN_VALUE;
    int findMaxSum(Node root)
    {
        //your code goes here
        ans = Math.max(solve(root), ans);
        return ans;
    }

    int solve(Node root)
    {
        if(root == null)
            return 0;

        int leftSum = solve(root.left);
        int rightSum = solve(root.right);

        int updateLeft = Math.max(leftSum, 0);
        int updateRight = Math.max(rightSum, 0);

        ans = Math.max(ans, updateLeft+updateRight+root.data);

        return root.data + Math.max(updateLeft, updateRight);
    }
