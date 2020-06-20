public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int i,a1,n;
        n=a.size();
        a1=0;
        for(i=0;i<n;i++)
        {
            if(!a.get(i).equals(b))
            {
                a.set(a1,a.get(i));
                a1++;
            }
        }
        return a1;
    }
}
