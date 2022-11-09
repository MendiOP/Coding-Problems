package com.company;

import java.util.Arrays;

public class reverseWord {
    String solve(String s){

        int l = s.length();
        char[] str = s.toCharArray();
        System.out.println(str);

        int low = 0;
        int high;
        for(int i=0;i<l;i++){
            if(str[i] == ' ' || i == l-1){

                if(i == l-1)
                   high = i;
                else
                    high = i-1;

                while (low<=high){
                    char t ;
                    t = str[low];
                    str[low] = str[high];
                    str[high] = t;

                    low++;
                    high--;
                }
                low = i+1;
            }
        }

        return String.valueOf(str);
        //return Arrays.toString(str);
    }

    public static void main(String [] args){
        reverseWord r = new reverseWord();
        String s = "Let's take LeetCode contest";
        String ans = r.solve(s);
        System.out.println(ans);

    }
}
