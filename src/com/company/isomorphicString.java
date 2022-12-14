class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Boolean> m2  = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m1.containsKey(c1))
            {
                if(m1.get(c1) != c2)
                    return false;
            }
            else
            {
                if(m2.containsKey(c2))
                {
                    return false;
                }
                else
                {
                    m1.put(c1, c2);
                    m2.put(c2, true);
                }
            }
        }

        return true;
    }
}
