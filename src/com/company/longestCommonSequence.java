public class LongestCommonSequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] cache = new int[1001][1001];
        int m = text1.length();
        int n = text2.length();

        for(int i = 1; i < m + 1; i++){
            for(int j = 1; j < n + 1; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1))
                    cache[i][j] = 1 + cache[i - 1][j - 1];

                else cache[i][j] = Math.max(cache[i - 1][j] , cache[i][j - 1]);

            }
        }
        return cache[m][n];
    }

    public static void main(String[] args) {
        LongestCommonSequence l = new LongestCommonSequence();
        String s1 = "oxcpqrsvwf";
        String s2 = "shmtulqrypy";

        System.out.println(l.longestCommonSubsequence(s1, s2));
    }
}
