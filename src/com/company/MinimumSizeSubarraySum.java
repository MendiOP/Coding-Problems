public class MinimizeSizeSubArary {

    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];

            while(sum >= target)
            {
                min = Math.min(min, i-left+1);
                sum -= nums[left++];
            }
        }

        if(min == Integer.MAX_VALUE)
            return 0;

        return min;
    }
    public static void main(String[] args) {
        MinimizeSizeSubArary m = new MinimizeSizeSubArary();

        int[] arr = {1,1,1,1,1,1,1,1};
        int target = 11;

        System.out.println(m.minSubArrayLen(target, arr));
    }
}
