package com;

import java.util.Scanner;

public class AlmostAnaragram {

    int x=10;
    String s="dfafga";
    char c='c';

    void solve()
    {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        int[] arr = new int[26];
        for(int i = 0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }

        for(int i = 0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
        }

        int count=0;
        for(int i : arr)
            count+=Math.abs(i);
        System.out.println(count);
    }

    static void checkString(String s)
    {
        int v=0;
        int c=0;

        //Your code here
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
                v++;
            }
            else {
                if(Character.isLetter(s.charAt(i)))
                    c++;
            }
        }
        System.out.println(v +" "+ c);
        if(v>c)
            System.out.print("Yes");
        else if(c>v)
            System.out.print("No");
        else
            System.out.print("Same");

    }

    static void logicOp(boolean a, boolean b){
        /*output (a&&b), (a||b), and ((!a)&&(!b))separated by spaces*/
        System.out.print(a&&b);
        System.out.print(a||b);
        System.out.print(!(a&b) );
    }

    public int binary_to_decimal(String str) {
        // Code here

        int ans=0;

        int p=str.length()-1;
        int i=0;
        while (i<str.length())
        {
            if(str.charAt(i) == '1')
                ans += Math.pow(2,p);
            p--;
            i++;
        }

        return ans;
    }

    public void toBinary(String N)
    {
        // Code here
        int ans=0;

        String s="";
        int n = Integer.parseInt(N);
        while(n > 0){
            s = n % 2 + s;
            n=n/2;
        }
        System.out.println(s);

    }

    public static void main(String[] args)
    {
        AlmostAnaragram obj = new AlmostAnaragram();

        //a.solve();


        obj.toBinary("10");
    }

}
