public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int i,n,b;
        n=a.size();
        b=0;
        for(i=0;i<n-1;i++)
        {
            if(!a.get(i).equals(a.get(i+1)))
            {
                a.set(b,a.get(i));
                b++;
            }
        }
        a.set(b,a.get(n-1));
        b++;
        return b;
    }
}
