import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(nums[i]))
            {
               int diff = Math.abs(hm.get(nums[i]) - i);
               if(diff <= k)
                   return true;
               hm.put(nums[i], i);
            }
            else
                hm.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();

        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(c.containsNearbyDuplicate(arr, k));
    }
}
