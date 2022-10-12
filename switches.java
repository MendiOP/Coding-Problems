package com;

import java.util.Scanner;


class test
{
    private String s1, s2;
    int id;
    private static int count = 0;
    final int x;

        test()
        {
            System.out.println("A test object is made");
            x = 100;
        }

        test setS1(String s1)
        {
            this.s1 = s1;
            return this;
        }

        test setS2(String s2)
        {
            this.s2 = s2;
            return this;
        }

        void print()
        {
            id = ++count;
            System.out.println(s1 + " " + s2);
            System.out.println("ID : " + id);
        }
}

public class switches {

    static final float PI = (float)3.1416;

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        test t = new test();
        t.setS1("Mehedi").setS2("Hasan");
        t.print();

        t.setS1("Mehedi").setS2("Hasan");
        t.print();

        t.setS1("Mehedi").setS2("Hasan");
        t.print();

        t.setS1("Mehedi").setS2("Hasan");
        t.print();

        //System.out.println(test.count);

        System.out.println(t.x);
        test t2 = new test();
        System.out.println(t2.x);

        int arr1[] = {1,2,3};
        int arr2[] = {1,2,3};
        int arr3[] = arr1;

        if(arr1 == arr3)
            System.out.println("Jukkka");
        else
        {
            System.out.println("fafgafgasdfga");
        }
    }
}
