import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int i,j,n,m;
        i=0;
        j=0;
        n=A.size();
        m=B.size();
        ArrayList<Integer> C=new ArrayList<Integer>();
        while(i<n && j<m)
        {
            if(A.get(i)<B.get(j))
            {
                i++;
            }
            else if(A.get(i)>B.get(j))
            {
                j++;
            }
            else
            {
                C.add(A.get(i));
                i++;
                j++;
            }
        }
        return C;
    }
}
