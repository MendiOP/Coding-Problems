package com.company;

public class powerOf2 {
    boolean solve(int number){
        int x = (int) Math.floor(Math.log(number) / Math.log(2));
        x = 1 << x;
        return x == number;
    }

    public static void main(String[] args){
        powerOf2 p = new powerOf2();
        System.out.println(p.solve(536870912));
        System.out.println(Math.log(536870912) / Math.log(2));
    }
}
