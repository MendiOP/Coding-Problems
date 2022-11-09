package com.company;

public class digitSum {
    int solve(int num){
        int total = 0;
        while(num > 0){
            total = total + num %10;
            num = num / 10;
        }
        return total;
    }
    public static void main(String[] args){
        digitSum d = new digitSum();
        System.out.println(d.solve(38));
    }
}
