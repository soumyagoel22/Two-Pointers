import java.util.*;

public class Solution {
    public int maxArea(ArrayList<Integer> a) {
        if(a.size() <2 || a == null)
            return 0;
        int max = 0;
        int left = 0;
        int right = a.size()-1;
        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(a.get(left), a.get(right)));
            if (a.get(left) < a.get(right))
                left++;
            else
                right--;
        }
        
        return max;
    }
}
