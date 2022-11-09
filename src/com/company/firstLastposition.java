package com.company;

public class firstLastposition {
    public int[] searchRange(int[] nums, int target) {
        int[] resultArr={binarySearch(nums,target,true),binarySearch(nums,target,false)};
        return resultArr;

    }
    public int binarySearch(int[] nums,int target,boolean isStart){
        int start=0;
        int end=nums.length-1;
        int mid,ans=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                ans=mid;
                if(isStart){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }

        }
        return ans;
    }

    public static void main(String[] args){
        firstLastposition f = new firstLastposition();
        int[] arr = {1,2,3,5,7,8,9};
        int[] ans = f.searchRange(arr,5);
        for(int i : ans)
            System.out.print(i + " ");
    }
}
