class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if(p.length() > s.length())
            return list;

        int k = p.length();

        int[] parr = new int[26];
        int[] sarr = new int[26];

        for(int i=0; i<k; i++){
            parr[p.charAt(i)-'a']++;
        }

        for(int i=0; i<k; i++){
            sarr[s.charAt(i)-'a']++;
        }

        if(isAnar(parr, sarr))
            list.add(0);

        for(int i=k; i<s.length(); i++)
        {
            sarr[s.charAt(i)-'a']++;
            sarr[s.charAt(i-k)-'a']--;

            if(isAnar(sarr, parr))
                list.add(i-k+1);
        }

        return list;
    }

    private boolean isAnar(int[] parr, int[] sarr)
    {
        return Arrays.equals(parr, sarr);
    }
}

