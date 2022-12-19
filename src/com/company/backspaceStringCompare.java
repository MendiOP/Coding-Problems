import java.util.ArrayList;

public class Main {

    public boolean backspaceCompare(String s, String t) {
        String str = "";
        String temp = "";

        int id;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != '#')
                str += s.charAt(i);
            else
            {
                id = i - 1;
                if(id >= 0)
                {
                    str = str.substring(0, id);
                }
            }
        }

        for(int i=0; i<t.length(); i++)
        {
            if(t.charAt(i) != '#')
                temp += t.charAt(i);
            else
            {
                id = i - 1;
                if(id >= 0)
                {
                    temp = temp.substring(0, id);
                }
            }
        }

        return str.equals(temp);
    }
    public static void main(String[] args) {
        Main m = new Main();
        String s = "xywrrmu#p";
        String t = "xywrrmp";
        System.out.println(m.backspaceCompare(s, t));
    }
}
