package com.company;

public class mismatch {
    int[] solve(int[] nums){
        int[] ans = new int[2];

        for(int i=1;i<nums.length;i++)
            if(nums[i] == nums[i-1]){
                if(nums[0] != 1 && i-1 == 0){
                    ans[1] = nums[i] -1;
                    ans[0] = nums[i];
                    break;
                }
                else {
                    ans[0] = nums[i - 1];
                    ans[1] = nums[i] + 1;
                    break;
                }
            }
        return ans;
    }
    public static void main(String[] args){
        mismatch m = new mismatch();
        int[] arr = {1,1};
        int[] ans = m.solve(arr);
        for(int i : ans)
            System.out.print(i + " ");
    }
}
