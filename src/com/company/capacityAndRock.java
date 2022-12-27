import java.util.Arrays;

public class capacityAndRock {

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int row = rocks.length;

        int[] arr = new int[row];
        for(int i=0; i<row; i++)
        {
            arr[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(arr);
        int bag=0;
        int j=0;
        while(additionalRocks > 0 && j < row)
        {
            if(arr[j] <= additionalRocks) {
                additionalRocks -= arr[j];
                bag++;
            }
            j++;
        }
        return bag;
    }
    public static void main(String[] args) {
        capacityAndRock c = new capacityAndRock();
        int[] cap = {10,2,2};
        int[] roc = {2,2,0};
        int max = 208;
        System.out.println(c.maximumBags(cap, roc, max));
    }
}
