package com.company;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring {
    //solution 1

    int solve(String s){
        int l = s.length();
        int ans = 0;

        String str = "";

        for(char c : s.toCharArray()){
            String current = String.valueOf(c);
            if(str.contains(current)){
                str = str.substring(str.indexOf(current) + 1);

            }
            str = str + current;
            ans = Math.max(str.length() , ans);
        }
        return ans;
    }

    //Solution 2
    int Solve(String s){
        int l = s.length();
        int i = 0;
        int j = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
        while(i < l){
            Character c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            ans = Math.max(ans, i-j+1);
            i++;
        }
        return ans;
    }

    public static void main(String[] args){
        longestSubstring l = new longestSubstring();
        String s = "a";
        int ans = l.Solve(s);
        System.out.println(ans);
    }
}
