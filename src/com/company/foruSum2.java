package com.company;

public class foruSum2 {
    int solve(int[] nums1 , int[] nums2 , int[] nums3 , int[] nums4){
        int l = nums1.length;
        int ans = 0;
        for(int i = 0;i<l;i++)
            for(int j = 0;j<l;j++)
                for(int k = 0;k<l;k++)
                    for(int m = 0;m<l;m++){
                        if(nums1[i] + nums2[j] + nums3[k] + nums4[m] == 0)
                            ans++;
                    }
        return ans;
    }

    public static void main(String[] args){
        foruSum2 f = new foruSum2();
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        int ans = f.solve(nums1,nums2,nums3,nums4);
        System.out.println(ans);
    }
}
