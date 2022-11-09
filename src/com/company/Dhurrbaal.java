package com.company;

import java.util.*;

public class Dhurrbaal {

    int[] Solve(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int max = arr[i+1];
            for(int j = i+1;j<n;j++){
                if(max < arr[j]){
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        char c= '2';
        int t = Integer.parseInt(String.valueOf(c));
        System.out.println(t);

        arr[n-1] = -1;
        return arr;
    }

    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
        for(int i = lowLimit;i<=highLimit;i++){
            int sum = 0;
            int it = i;
            while(it>0){
                sum += (it%10);
                it=it/10;
            }

            hm.put(sum , hm.getOrDefault(sum , 0)+1);

        }
        System.out.println(hm);
        int t = (Collections.max(hm.values()));
        return t;
    }

    public static void main(String [] args){
        Dhurrbaal d = new Dhurrbaal();
        System.out.println(d.countBalls(1,10));

    }
}
