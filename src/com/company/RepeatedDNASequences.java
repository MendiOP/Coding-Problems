import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNA {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> list = new ArrayList<>();

        if(s.length() < 10)
            return list;

        String str = s.substring(0, 10);
        hm.put(str, 1);

        for(int i=1; i<=s.length()-10; i++)
        {
            str = s.substring(i, i+10);
            hm.put(str, hm.getOrDefault(str, 0)+1);
        }

        for(String s1 : hm.keySet())
        {
            if(hm.get(s1) > 1)
                list.add(s1);
        }

        return list;
    }
    public static void main(String[] args) {
        RepeatedDNA r = new RepeatedDNA();
        String s = "AAAAAAAAAAAAA";
        System.out.println(r.findRepeatedDnaSequences(s));
    }
}
