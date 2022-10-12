package com;

import java.util.Scanner;

public class mstrixsum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] arr = new int[n][m];

            int[] sum = new int[n];

            for(int i = 0;i < n; i++) {
                int s=0;
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    s += arr[i][j];
                }
                sum[i] = s;
            }

            boolean f = true;
            for(int i = 0;i < n;i++){
                if(sum[i] != sum[n-1-i])
                    f=false;
            }

            if(f)
                System.out.println("YES");
            else
                System.out.println("NO");

            t--;
        }

    }

}
