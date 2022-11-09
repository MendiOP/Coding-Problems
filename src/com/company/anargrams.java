package com.company;

import java.util.Arrays;

public class anargrams {
    boolean solve(String s , String t){
        char[] t1 = t.toCharArray();
        char[] s1 = s.toCharArray();

        Arrays.sort(t1);
        Arrays.sort(s1);

        String s2 = new String(s1);
        String t2 = new String(t1);

        return s2.equals(t2);
    }
    public static void main(String[]args){
        anargrams a = new anargrams();
        String t = "nagaram";
        String s = "anagram";

        System.out.println(a.solve(t,s));
    }
}
