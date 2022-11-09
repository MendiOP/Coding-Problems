package com.company;

import java.util.Arrays;

public class rotateArray {
    int[] solve(int[] arr,int k){
        int l = arr.length;
        int[] ans = new int[l];
        k =  k % l;
        for(int i = 0;i<l;i++){
            if(i<k){
                ans[i] = arr[l+i-k];
            }
            else {
                ans[i] = arr[i - k];
            }
        }
        for(int i =0 ;i<l;i++){
            arr[i] = ans[i];
        }
        return arr;
    }

    public static void main(String []args){
        rotateArray r = new rotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        int[] ans = new int[arr.length];
        ans = r.solve(arr,2);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
