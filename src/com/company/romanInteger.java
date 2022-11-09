package com.company;

public class romanInteger {
    int solve(String s){
        int l = s.length();
        int ans = 0;
        char[] str = s.toCharArray();
        for(int i = 0;i<l;){
            char ch = str[i];
            if(ch == 'I'){
                if(i+1 < l && str[i+1] == 'V' ) {
                    ans = ans + 4;
                    i = i + 2;
                }
                else if(i+1 < l && str[i+1] == 'X') {
                    ans = ans + 9;
                    i = i + 2;
                }
                else {
                    ans = ans + 1;
                    i++;
                }
            }


            else if(ch == 'X'){
                if(i+1 < l && str[i+1] == 'L' ){
                    ans = ans + 40;
                    i=i+2;
                }
                else if(i+1 < l && str[i+1] == 'C'){
                    ans = ans + 90;
                    i=i+2;
                }
                else{
                    ans = ans + 10;
                    i++;
                }
            }

            else if(ch == 'V'){
                ans = ans + 5;
                i++;
            }

            else if(ch == 'L'){
                ans = ans + 50;
                i++;
            }

            else if(ch == 'C'){
                if(i+1 < l && str[i+1] == 'D'){
                    ans = ans + 400;
                    i=i+2;
                }
                else if(i+1 < l && str[i+1] =='M'){
                    ans =ans + 900;
                    i=i+2;
                }
                else{
                    ans = ans + 100;
                    i++;
                }
            }
            else if(ch == 'D'){
                ans =ans + 500;
                i++;
            }
            else{
                ans =ans + 1000;
                i++;
            }
        }


        return ans;
    }

    public static void main(String[] args){
        romanInteger r = new romanInteger();
        String s = "LVIII";
        int ans = r.solve(s);
        System.out.println(ans);
    }
}
