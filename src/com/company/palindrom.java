package com.company;

import java.util.Scanner;

public class palindrom {
    boolean solve(int x){
        int copyX = x;
        if(x<0)
            return false;

        int y =0;
        while(x!=0){
            y = 10*y + x%10;
            x=x/10;
        }
        return y == copyX;
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        palindrom p =new palindrom();
        System.out.println(p.solve(122211));
    }
}
