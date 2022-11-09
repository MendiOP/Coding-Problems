package com.company;

import java.util.Arrays;

public class Binarysearch {
    int binarySearch(int [] arr, int key){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(key<arr[mid]){
                high = mid-1;
            }
            else if(key>arr[mid]){
                low = mid+1;
            }
            else {
                return mid;
            }
        }

        return low;
    }



    public static void main(String[] args){
        Binarysearch b = new Binarysearch();
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(b.binarySearch(arr,1));
    }
}
