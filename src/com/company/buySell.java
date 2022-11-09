package com.company;

public class buySell {
    int solve(int[] arr){
        int l = arr.length;
        int min_price = arr[0];
        int profit = 0;

        for(int i=0;i<l;i++){
            profit = Math.max(profit, arr[i] - min_price);
            min_price = Math.min(min_price, arr[i]);
        }
        return profit;
    }

    public static void main(String [] args){
        buySell b = new buySell();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(b.solve(arr));
    }
}
