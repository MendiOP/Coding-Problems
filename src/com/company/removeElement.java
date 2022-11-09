package com.company;

public class removeElement {
    int solve(int[] arr ,int value){
        int l = arr.length;
        int count = l;
        for(int i : arr){
            if(i == value)
                count--;
        }

        int k = 0;
        for(int i = 0;i<l;i++){
            if(arr[i] != value){
                arr[k] = arr[i];
                k++;
            }
        }

        while(k<l){
            arr[k] = 0;
            k++;
        }

        return count;
    }

    public static void main(String[] args){
        removeElement r = new removeElement();
        int[] arr = {};
        int ans ;
        ans = r.solve(arr,6);

        System.out.print(ans + " ");
    }
}
