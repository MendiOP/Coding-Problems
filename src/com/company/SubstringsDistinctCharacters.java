public class SubstringOfDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int ans=0;
        int[] arr = new int[26];
        for(int i=0; i<3; i++)
            arr[s.charAt(i) - 'a']++;

        int c=0;
        for(int j=0; j<26; j++)
        {
            if(arr[j] == 1)
                c++;
        }
        if(c == 3)
            ans++;

        for(int i=1; i<=s.length()-3; i++)
        {
            arr[s.charAt(i-1) - 'a']--;
            arr[s.charAt(i+2) - 'a']++;

            c=0;
            for(int j=0; j<26; j++)
            {
                if(arr[j] == 1)
                    c++;
            }

            if(c == 3)
                ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        SubstringOfDistinctCharacters sb = new SubstringOfDistinctCharacters();
        String s = "xyzzaz";
        System.out.println(sb.countGoodSubstrings(s));
    }
}
