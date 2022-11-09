package com.company;

public class bitManipulation {
    int solve(int num){
        int ans = 0;
        String s = Integer.toString(num);
        char[] chars = s.toCharArray();
        for(char c : chars)
            if(c == '1')
                ans++;
        return ans;
    }
    public static void main(String[]args){
        bitManipulation b = new bitManipulation();
        System.out.println(b.solve(00000000000000000000000000001011));
    }
}
