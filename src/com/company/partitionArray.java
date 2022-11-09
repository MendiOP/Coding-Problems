package com.company;

import java.util.Arrays;

public class partitionArray {
    int[] solve(int[] arr , int pivot){
        int l = arr.length;
        int[] ans = new int[l];

        int j = 0;
        for (int k : arr)
            if (k < pivot) {
                ans[j] = k;
                j++;
            }

        for (int k : arr) {
            if (k == pivot) {
                ans[j] = k;
                j++;
            }
        }

        for (int k : arr)
            if (k > pivot) {
                ans[j] = k;
                j++;
            }

        arr = Arrays.copyOf(ans , l);
            return arr;
    }
    public static void main(String[] args){
        partitionArray p = new partitionArray();
        int[] arr = {-3,4,3,2};
        int[] ans = p.solve(arr,2);
        for(int i: ans)
            System.out.print(i + " ");
    }
}
