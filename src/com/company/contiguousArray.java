package com.company;


import java.util.HashMap;

public class contiguousArray {
    int solve(int[] arr)
    {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int n = arr.length;
        int sum = 0;
        int max_len = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)
                arr[i] = -1;
            else
                arr[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                max_len = i + 1;
            }

            if (hM.containsKey(sum)) {
                if (max_len < i - hM.get(sum)) {
                    max_len = i - hM.get(sum);
                }
            }
            else
                hM.put(sum, i);
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] == -1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }

        return max_len;
    }
    public static void main(String[] args){
        contiguousArray c = new contiguousArray();
        int[] arr = {0,1,0,1,1,1,0};
        int ans = c.solve(arr);
        System.out.println(ans);
    }
}
