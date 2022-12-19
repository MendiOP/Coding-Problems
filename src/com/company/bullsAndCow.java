class Solution {
    public String getHint(String secret, String guess) {
        int b=0;
        int l = secret.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<l; i++)
        {
            if(secret.charAt(i) == guess.charAt(i))
                b++;
            else{
                int get = hm.getOrDefault(secret.charAt(i), 0);
                hm.put(secret.charAt(i), ++get);
            }
        }

        int c=0;
        for(int i=0; i<l; i++)
        {
            if(hm.containsKey(guess.charAt(i)) && secret.charAt(i) != guess.charAt(i))
            {
                c++;

                if(hm.get(guess.charAt(i)) > 1)
                    hm.put(guess.charAt(i), hm.get(guess.charAt(i)) - 1);
                else if(hm.get(guess.charAt(i)) == 1)
                    hm.remove(guess.charAt(i));

            }
        }

        return b + "A" + c + "B";
    }
}
