package com;

class MergeSort {

    void merge(int[] arr, int l, int m, int r)
    {
        int l1 = m-l+1;
        int r1 = r - m;

        int[] L = new int[l1];
        int[] R = new int[r1];

        for(int i = 0;i < l1;i++)
        {
            L[i] = arr[l+i];
        }

        for(int j=0;j<r1;j++)
        {
            R[j] = arr[m+j+1];
        }

        int i = 0, j = 0;
        int k=l;
        while(i < l1 && j < r1)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = R[j];
                k++;
                j++;
            }
        }

        while(i < l1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < r1)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    void Sort(int[] arr , int l, int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;

            Sort(arr , l , m);
            Sort(arr , m+1 , r);

            merge(arr , l , m , r);
        }
    }

    void print(int[] arr)
    {
        for(int i : arr)
            System.out.print(i + " ");
    }
}

class Driver{
    public static void main(String[] args)
    {
        MergeSort ms = new MergeSort();
        int[] arr = {12, 11, 1, 65, 6, 73};
        ms.Sort(arr , 0 , arr.length - 1);
        ms.print(arr);
    }
}
