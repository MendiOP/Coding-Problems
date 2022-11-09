package com.company;

import java.util.HashMap;

public class makeString {
    boolean solve(String ransomNote , String magazine){
        HashMap<Character , Integer> hashMap1 = new HashMap<>();
        HashMap<Character , Integer> hashMap2 = new HashMap<>();

        for(char c : magazine.toCharArray())
            hashMap1.put(c , hashMap1.getOrDefault(c,0) + 1);

        for(char c : ransomNote.toCharArray())
            hashMap2.put(c , hashMap2.getOrDefault(c,0) + 1);

        for(char c : ransomNote.toCharArray()){
            if(hashMap1.get(c) == null || hashMap2.get(c) > (hashMap1.get(c)))
                return false;
        }

        return true;
    }
    public static void main(String[] args){
        makeString m = new makeString();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean bn = m.solve(ransomNote , magazine);
        System.out.println(bn);
    }
}
