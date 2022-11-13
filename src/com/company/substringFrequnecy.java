package com.company;

import java.util.Scanner;

public class substringFrequnecy {

    static int KMPSearch(String txt, String pat)
    {
        int[] lps = new int[pat.length()];

        computeLPSArray(pat, pat.length(), lps);

        int res=0;
        int i=0;
        int j=0;
        int k=0;

        while(i < txt.length())
        {
            if(txt.charAt(i) == pat.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if(j == 0)
                    i++;
                else
                    j = lps[j-1];
            }

            if(j == pat.length())
            {
                res++;
                j = lps[j-1];
                if(j != 0)
                    i = ++k;
                j=0;
            }
        }

        return res;
    }

    static void computeLPSArray(String pat, int M, int[] lps)
    {
        int prevLPS = 0;
        int i = 1;

        while( i < M)
        {
            if(pat.charAt(prevLPS) == pat.charAt(i))
            {
                lps[i] = prevLPS + 1;
                prevLPS++;
                i++;
            }
            else
            {
                if(prevLPS == 0) {
                    lps[i] = 0;
                    i++;
                }
                else
                {
                    prevLPS = lps[prevLPS - 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int i=1;
        while(i <= t)
        {
            String a = scan.next();
            String b = scan.next();

            int ans = KMPSearch(a, b);
            System.out.println("Case " + i + ": " + ans);

            i++;
        }
    }
}
