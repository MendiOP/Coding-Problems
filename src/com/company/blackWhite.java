package com.company;

import java.util.Scanner;

public class blackWhite {
    int allwhite(char[][] arr, int row, int col) {
        int ans = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 'B')
                    ans++;
            }
        }
        //System.out.println(ans);
        return ans;
    }

    void solve(char[][] ch,int r,int c,int n,int m){
        int ans = allwhite(ch,n,m);

        if(ch[r][c] == 'B'){
            System.out.println(0);
            return;
        }

        if(ans == 0){
            System.out.println(-1);
            return;
        }



        for(int i = 0;i<m;i++){
            if(ch[r][i] == 'B'){
                System.out.println(1);
                return;
            }
        }

        for(int i = 0;i<n;i++){
            if(ch[i][c] == 'B'){
                System.out.println(1);
                return;
            }
        }

        if(ans > 0){
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        blackWhite b = new blackWhite();
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t > 0) {

            int n= in.nextInt();
            int m= in.nextInt();
            int r= in.nextInt()-1;
            int c= in.nextInt()-1;

            char[][]ch=new char[n][m];
            for(int i=0;i<n;i++) {
                char[]ca=in.next().toCharArray();
                for(int j=0;j<m;j++) {
                    ch[i][j]=ca[j];
                }
            }

            b.solve(ch,r,c,n,m);

            t--;
        }
    }
}
