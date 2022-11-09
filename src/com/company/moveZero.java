package com.company;

public class moveZero {
    int[] solve(int[] arr){

        /*
            First solution

        int l = arr.length;
        int low = 0;
        int high = 0;
        int t = 0;
        while(high < l){
            if(arr[high] == 0)
                high++;
            else{
                t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;

                low++;
                high++;
            }
        }
        */
            // Second Solution

        int l = arr.length;
        int k = 0;
        for(int i = 0;i<l;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        while(k<l){
            arr[k] = 0;
            k++;
        }

        return arr;
    }


    public static void main(String[] args){
        moveZero m = new moveZero();
        int[] arr = {0,0,0,2,0};
        int[] ans = new int[arr.length];
        ans = m.solve(arr);

        for(int i : ans)
            System.out.print(i + " ");
    }
}
