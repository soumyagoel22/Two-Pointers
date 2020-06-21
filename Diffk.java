public class Solution {
    public int diffPossible(ArrayList<Integer> a, int b) {
        // int i,n,j,diff;
        // n=A.size();
        // i=0;
        // j=1;
        // while(i<n && j<n)
        // {
        //     diff=Math.abs(A.get(i)-A.get(j));
        //     if(diff==B && i!=j)
        //     return 1;
        //     else if(diff<B)
        //     j++;
        //     else
        //     i++;
        // }
        // return 0;
        
        // the above program is not passing reason
        
        int i = 0;
        int j = 1;
        while(j < a.size() && i < a.size()){
                int diff = a.get(j) - a.get(i);
                if(diff == b && i != j)
                    return 1;
                else if(diff < b)
                    j++;
                    // we increase the value of j as it have value greater than the
                    // previous one so the diff will increase and may reach to the
                    // value of b
                else 
                    i++;
                    // it means the diff is greater than b and if we increase the 
                    // value of i so that we get value less than the previous one
                    // and may be equal to b
        }
        return 0;
    }
}
