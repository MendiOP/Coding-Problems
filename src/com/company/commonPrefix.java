package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class commonPrefix {
    public String longestCommonPrefix(String[] strs) {
            String ans = "";
            String s ="feifjifjiefiahfihafihakfhihfihnfiaFifibiakANFiahfiaheifhakohfehaifAf";
            for(String s1 : strs){
                if(s1.length() < s.length())
                    s = s1;
            }
            return ans;
    }
    public static void main(String[] args){
        commonPrefix c = new commonPrefix();
        String[] str = {"flower","flow","flight"};
        c.longestCommonPrefix(str);
    }

}
