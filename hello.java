package com;


import java.util.Scanner;

public class hello {

    int solve(String s)
    {
        int ans=0;
        int v=1, c=2, o=3;
        s = s.toLowerCase();

        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch))
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u')
                    ans += v;
                else
                    ans += c;
            }
            else
                ans+=o;
        }

        return ans;
    }
    public static void main(String[] args){

        hello h = new hello();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t >0)
        {
            String s = sc.next();

            int ans=0;
            int v=1, c=2, o=3;
            s = s.toLowerCase();

            for(char ch : s.toCharArray()){
                if(Character.isLetter(ch))
                {
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u')
                        ans += v;
                    else
                        ans += c;
                }
                else
                    ans+=o;
            }

            System.out.println(ans);

            t--;
        }


    }
}
