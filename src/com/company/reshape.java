package com.company;

public class reshape {
    int[][] solve(int[][] mat , int r , int c){
        int[][] ans = new int[r][c];

        if(mat.length * mat[0].length != r*c)
            return mat;
        int R = 0;
        int C = 0;
        for(int[] inner : mat)
            for(int j : inner) {
                ans[R][C] = j;
                C++;
                if(C >= c){
                    C = 0;
                    R++;
                }
            }
       // System.out.println(ans.length);
        //System.out.println(ans[0].length);
        //System.out.println();
        return ans;
    }
    public static void main(String[] args){
        reshape r = new reshape();
        int[][] mat = {{1,2,5} , {3,4,8}};
        int[][] ans =  (r.solve(mat , 3,2));  //[[1,2],[5,3],[4,8]]
        for(int[] inner : mat)
            for(int j : inner)
                System.out.println(j);
    }
}
