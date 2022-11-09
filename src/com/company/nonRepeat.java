package com.company;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class nonRepeat {
    int solve(String s){
        int l = s.length();
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for(int i = 0;i<l;i++) {
            int finalI = i;
            if (s.chars().filter(ch -> ch == chars[finalI]).count() == 1)
                return i;
        }

        return -1;
    }
    public static void main(String[] args){
        nonRepeat n = new nonRepeat();
        String s = "lllvv";
        int ans = n.solve(s);
        System.out.println(ans);
    }
}
