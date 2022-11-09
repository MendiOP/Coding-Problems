package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class removeInterval {
    int solve(int[][] arr)
    {
        return 0;
    }
    public static void main(String[] args)
    {
        removeInterval r = new removeInterval();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {1,2,4,1,3,5,1,2,4};
        for(int i = 0;i<arr.length;i++)
        {
            hm.put(arr[i] , hm.getOrDefault(arr[i] , 0) + 1);
            if(hm.get(arr[i]) > 1){
                System.out.println("The curent index is : " + i);
                break;
            }
        }
    }
}
