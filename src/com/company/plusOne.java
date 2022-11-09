package com.company;

import java.util.Arrays;

public class plusOne {
    long[] solve(long[] arr){
        int l = arr.length;
        int c =l-1;
        long num=0;
        for (long j : arr) {
            num = (long) (num + j * Math.pow(10, c));
            c--;
        }

        num++;
        //System.out.println(num);

        if(l==1 && arr[0] == 9){
            long[] ans = new long[2];
            ans[0] =1;
            return ans;
        }

        String s2 = String.valueOf(num);
        String s1 = String.valueOf(num-1);

        if(s2.length() > s1.length())
            l =l + 1;
        long[] ans = new long[l];
        
        for(int i = l-1;i>=0;i--){
            ans[i] = num%10;
            //System.out.println(ans[i] + " ");
            num = num/10;
        }
        return ans;
    }

    public static void main(String[] args){
        plusOne p = new plusOne();
        long[] arr = {9,8,7,6,5,4,3,2,1,0};

        long[] ans = new long[arr.length];
        ans = p.solve(arr);
        //System.out.println();
        for (long j: ans) {
            System.out.print(j + " ");
        }
    }
}
