package com.company;

import java.util.Arrays;

public class kdifferent {
    int solve(int[] arr , int k){
        int l = arr.length;
        Arrays.sort(arr);
        int low=0,high=0;
        int ans = 0;
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
        while(low<=high && high < l){
            if(Math.abs(arr[low] - arr[high]) == k ){
                ans++;
                high++;
                low++;
            }
            else if(Math.abs(arr[low] - arr[high]) < k)
                high++;
            else{
                low++;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        kdifferent k = new kdifferent();
        int[] arr = {1,2,4,4,3,3,0,9,2,3};
        int[] arr1 = {1,1,2,2,5,5};
        System.out.println(k.solve(arr , 0));
    }
}
