package com.company;

public class reverseString {
    char[] solve(char[] arr){

        int l = arr.length;
        int low = 0;
        int high = l - 1;
        while (low<=high){
            char t ;
            t = arr[low];
            arr[low] = arr[high];
            arr[high] = t;

            low++;
            high--;
        }

        return arr;
    }

    public static void main(String [] args){
        reverseString r = new reverseString();
        char[] arr = {'H','e','l','l','o'};
        char[] ans = new char[arr.length];

        ans = r.solve(arr);
        for(char c : ans)
            System.out.print(c + " ");
    }
}
