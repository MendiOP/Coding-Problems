package com.company;

import java.util.Scanner;

public class balancedArray {
    int[] solve(int l){
        int[] ans = new int[l];
        if(l%4!=0)
            return ans;
        int i,t=2;
        for(i=0;i<l/2;i++) {
            ans[i] = t;
            t=t+2;
        }
        t=1;
        for(int j=i;j<l;j++) {
            ans[j] = t;
            t=t+2;
        }

        ans[l-1] = ans[l-1] + l/2;
        return ans;
    }

    public static void main(String[]args){
        balancedArray b = new balancedArray();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            int[] ans = b.solve(scan.nextInt());
            if(ans[0] == 0)
                System.out.print("NO");
            else{
                System.out.println("YES");
                for(int i : ans)
                    System.out.print(i + " ");
            }
            System.out.println();
            t--;
        }
    }
}
