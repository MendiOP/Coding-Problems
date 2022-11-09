package com.company;

import java.util.*;

public class codeforces {
    int solve(String s){
        int l = s.length();

        Set<Character> set = new HashSet();

        long count;
        for(int i = 0;i<l;i++){
            set.add(s.charAt(i));
        }
        int[] intArr = new int[set.size()];
        int i = 0;
        for(char c : set) {
            count = s.chars().filter(ch -> ch == c).count();
            intArr[i] = (int)count;
        }

        Arrays.sort(intArr);


        System.out.println(set);
        return 1;
    }
    public static void main(String[] args){
        codeforces cf = new codeforces();
        String s = "aaabbbbccc";
        System.out.println(cf.solve(s));
    }
}
