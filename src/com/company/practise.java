package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class practise {
    String show(int n , String s)
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 1;i<=10;i++){
            sum += i;
            hm.put(sum , i);
        }

        int N = hm.get(n);
        String ans = "";
        int t = 0;
        for(int i = 0;i<N;i++){
            t += i;
            ans = ans + s.charAt(t);
        }

        return ans;
    }
    public static void main(String [] args)
    {
        practise p = new practise();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        System.out.println(p.show(n,s));
    }
}
