public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i,n,m,j;
        n=a.size();
        m=b.size();
        i=0;
        j=0;
        while(j<m)
        {
            a.add(b.get(j));
            j++;
        }
        Collections.sort(a);
    }
}
