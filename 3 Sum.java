import java.util.*;

public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
         int res = 0, diff = Integer.MAX_VALUE;
        Collections.sort(A);
        for(int i = 0; i < A.size() - 2; i++) {
            int j = i + 1, k = A.size() - 1;
            while(j < k) {
                int sum = A.get(i) + A.get(j) + A.get(k);
                
                if(sum == B) return sum;
                else if(sum > B) k--;
                else j++;
                
                if(Math.abs(B - sum) < diff) {
                    res = sum;
                    diff = Math.abs(B - sum);
                }
                
            }
        }
        
        return res;
    }
}
