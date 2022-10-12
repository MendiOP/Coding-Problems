package com;

import java.util.Arrays;
import java.util.Scanner;

class TestClass {

    private int a,b;
    TestClass(int a , int b){
        this.a = a;
        this.b = b;
    }
    public int findMin()
    {
        int[] s = new int[4];
        s[0] = a + b;
        s[1] = a - b;
        s[2] = a * b;

        try{
            int d = a / b;
            s[3] = d;
        }
        catch (ArithmeticException ex)
        {
            s[3] = Integer.MAX_VALUE;
        }

        return Arrays.stream(s).min().getAsInt();

    }
}

class Munna{
    public static void main(String[] temp){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            TestClass t = new TestClass(a,b);
            System.out.println(t.findMin());
            n--;
        }

    }
}
