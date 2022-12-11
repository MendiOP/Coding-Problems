class MyCmp implements Comparator<Map.Entry<Integer,Integer>>
{
    public int compare(Map.Entry<Integer,Integer> m1, Map.Entry<Integer,Integer> m2)
    {
        if(m1.getValue() == m2.getValue())
        {
            return m1.getKey() - m2.getKey();
        }
        else
        {
            return m2.getValue() - m1.getValue();
        }
    }
}



static void sortByFreq(int[] arr)
    {
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<arr.length; i++)
        {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(m.entrySet());

        Collections.sort(list, new MyCmp());

        int index =0;

        for(Map.Entry<Integer,Integer> e: m.entrySet())
        {
        	for(int i=0; i<e.getValue(); i++)
        	{
        		arr[index++] = e.getKey();
        	}
        }
    }
