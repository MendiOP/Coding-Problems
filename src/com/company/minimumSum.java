package com.company;

import java.util.Arrays;

public class minimumSum {
    int solve(int n){
        int s1 = 0;
        int s2 = 0;
        int[] ans = new int[4];
        for(int i = 0;i<4;i++){
            ans[i] = n %10;
            n = n/10;
        }
        Arrays.sort(ans);
        s1 = ans[0]*10 + ans[2];
        s2 = ans[1]*10 + ans[3];

        return s1+s2;
    }

    public static void main(String [] args){
        minimumSum m = new minimumSum();
        int ans = m.solve(4009);
        System.out.println(ans);
    }
}
