package com.company;

import java.util.Arrays;

public class findDifference {
    char solve(String s,String t){
        int l = s.length();

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        for(int i = 0 ;i<l;i++){
            char ch1 = s1[i];
            char ch2 = t1[i];
            if(ch1 != ch2)
                return ch2;
        }
        return t1[l];
    }

    public static void main(String[]args){
        findDifference f = new findDifference();
        String s = "bcda";
        String t = "aecdb";

        System.out.println(f.solve(s,t));
    }
}
