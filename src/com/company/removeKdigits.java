class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for(char c : num.toCharArray())
        {
            while(!st.isEmpty() && st.peek() > c && k>0)
            {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(!st.isEmpty() && k > 0)
        {
            st.pop();
            k--;
        }

        if(st.isEmpty())
            return "0";

        StringBuilder sb  = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        int j = sb.length()-1;
        while(j >= 0 && sb.charAt(j) == '0'){
            sb.deleteCharAt(j);
            j--;
        }
        
        return sb.length() == 0 ? "0" : sb.reverse().toString();
    }
}
