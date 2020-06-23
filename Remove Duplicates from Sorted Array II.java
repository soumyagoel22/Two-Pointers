public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i,n,c=0,c1=0;
        n=a.size();
        if(n==0)
        return 0;
        else if(n==1)
        {
            return 1;
        }
        for(i=1;i<n;i++)
        {
            if(a.get(i).equals(a.get(i-1)))
            {
                if(c==0)
                {
                    a.set(c1,a.get(i-1));
                    c++;
                    c1++;
                }
            }
            else
            {
                a.set(c1,a.get(i-1));
                c1++;
                c=0;
            }
        }
            a.set(c1,a.get(n-1));
            c1++;
        return c1;
    }
}
