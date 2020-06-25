import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c){
    int diff = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i, j, k;
        for(i = 0, j = 0, k = 0; i < a.size() && j < b.size() && k < c.size();){
            min = Math.min(a.get(i), Math.min(b.get(j), c.get(k)));
            max = Math.max(a.get(i), Math.max(b.get(j), c.get(k)));
            diff = Math.min(diff, max - min);
            if(diff == 0)
                break;
            if(a.get(i) == min)
                i++;
            else if(b.get(j) == min)
                j++;
            else
                k++;
                // increment of i,j,k is not clear
        }
        return diff;
    }
}
