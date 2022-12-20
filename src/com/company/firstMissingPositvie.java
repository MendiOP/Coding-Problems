class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        for(int i=0; i<nums.length; i++)
        {
            int pos = nums[i] - 1;

            while((nums[i]>=1 && nums[i]<=l) && nums[i] != nums[pos])
            {
                int t = nums[i];
                nums[i] = nums[pos];
                nums[pos] = t;

                pos = nums[i] - 1;
            }
        }
        
        for(int i=0; i<nums.length; i++)
        {
            if(i+1 != nums[i])
                return i+1;
        }

        return l+1;
    }
}
