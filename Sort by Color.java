import java.util.*;

public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        int i,n,c=0,c1=0,c2=0;
        n=a.size();
        for(i=0;i<n;i++)
        {
            if(a.get(i).equals(0))
            c++;
            else if(a.get(i).equals(1))
            c1++;
            else if(a.get(i).equals(2))
            c2++;
        }
        for(i=0;i<c;i++)
        {
            a.set(i,0);
        }
        for(i=c;i<(c+c1);i++)
        {
            a.set(i,1);
        }
        for(i=(c+c1);i<(c+c1+c2);i++)
        {
            a.set(i,2);
        }
    }
}
