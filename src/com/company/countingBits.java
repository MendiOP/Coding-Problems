package com.company;

public class countingBits {
    public int[] countBits(int n) {

        int [] ans = new int[n+1];
        for(int i = 0;i<=n;i++){
            ans[i] = (i/2) + (i%2);
        }
        return ans;
    }
    public static void main(String[] args){
        countingBits cb = new countingBits();
        int[] ans = cb.countBits(5);
        for(int i : ans)
            System.out.println(i + " ");
    }
}
