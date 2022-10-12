package com;

import java.util.Arrays;
import java.util.Scanner;

class anarg{
    boolean Ana(String s1 , String s2)
    {
        s1 = removeJunk(s1).toLowerCase();
        s2 = removeJunk(s2).toLowerCase();

        s1 = sort(s1);
        s2 = sort(s2);

        return s1.equals(s2);
    }

    private String removeJunk(String s)
    {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l;i++)
        {
            if(Character.isLetter(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    private String sort(String s)
    {
        char[] schar = s.toCharArray();
        Arrays.sort(schar);
        return new String(schar);
    }
}


public class Anargrams {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        anarg ang = new anarg();

        if(ang.Ana(s1,s2))
            System.out.println("They are anargrams.");
        else
            System.out.println("They are not anargram.");
    }
}
